FROM openjdk:21-jdk-slim

WORKDIR /app

COPY *.jar /app/demo.jar

EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app/demo.jar"]