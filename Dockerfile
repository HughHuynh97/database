#
# Build stage
#
FROM maven:3.8.5-openjdk-17
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM openjdk:17.0.2-oraclelinux8
COPY --from=build /home/app/target/*.jar /usr/local/lib/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]