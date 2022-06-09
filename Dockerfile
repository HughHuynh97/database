# Build stage
#
FROM maven:3.8.5-openjdk-17
COPY . /app/
WORKDIR /app
RUN mvn -f /pom.xml clean package

#
# Package stage
#
FROM openjdk:17.0.2-oraclelinux8
VOLUME /tmp
COPY --from=build /target/database-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
