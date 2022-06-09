### BUILD image
FROM maven:3.8.5-openjdk-17 as builder
# create app folder for sources
RUN mkdir -p /
WORKDIR /
COPY pom.xml /
#Download all required dependencies into one layer
RUN mvn -B dependency:resolve dependency:resolve-plugins
#Copy source code
COPY src /src
# Build application
RUN mvn clean install

FROM openjdk:17.0.2-oraclelinux8
VOLUME /tmp
ADD /target/database-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
