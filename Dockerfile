FROM openjdk:17.0.2-oraclelinux8
VOLUME /tmp
COPY target/database-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
