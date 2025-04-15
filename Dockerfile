# Step 1: Use Maven to build the project with OpenJDK 21
FROM maven:latest AS build

# Step 2: Set the working directory
WORKDIR /app

# Step 6: Copy the .jar file from the build stage
COPY /target/v1-0.0.1-SNAPSHOT.jar app.jar

# Step 7: Expose the port
EXPOSE 8080

# Step 8: Command to run the application
CMD ["java", "-jar", "app.jar"]
