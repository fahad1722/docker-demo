FROM openjdk:17-jdk-slim

EXPOSE 8080

ADD target/SpringbootDockerDemo.jar SpringbootDockerDemo.jar

ENTRYPOINT ["java", "-jar", "SpringbootDockerDemo.jar"]
