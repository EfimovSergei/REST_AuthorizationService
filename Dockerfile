FROM openjdk:8-jdk-alpine

EXPOSE 8080

COPY build/libs/AutorizationService-0.0.1-SNAPSHOT.jar app.jar
CMD ["java","-jar","app.jar"]
