FROM openjdk:8
ADD /target/notify-service-0.0.1-SNAPSHOT.jar notify-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "notify-service-0.0.1-SNAPSHOT.jar"]

EXPOSE 9000
