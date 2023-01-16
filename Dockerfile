FROM openjdk:17-jdk-slim-buster
WORKDIR /app

EXPOSE 8080

COPY target/*.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]