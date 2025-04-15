# Use an OpenJDK base image
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /v1

# Copy the built jar file into the container
COPY target/*.jar v1-0.0.1-SNAPSHOT.jar.jar

# Expose the default Spring Boot port
EXPOSE 8080

# Command to run the jar
ENTRYPOINT ["java", "-jar", "v1-0.0.1-SNAPSHOT.jar"]
