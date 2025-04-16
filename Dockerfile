# Use Amazon Corretto JDK 23 with Alpine as the base image (lightweight and optimized for Java)
FROM amazoncorretto:23-alpine

# Set metadata about the image author
LABEL authors="bright"

# Set the working directory inside the container to /app
WORKDIR /app

# Copy Gradle wrapper and project configuration files into the container
COPY build.gradle.kts gradlew gradlew.bat settings.gradle.kts /app/

# Copy the Gradle wrapper directory (contains wrapper JAR and properties)
COPY gradle /app/gradle/

# Pre-fetch dependencies to speed up subsequent builds and avoid redownloading
RUN ./gradlew dependencies --no-daemon

# Copy the full source code (your application code) into the container
COPY src ./src/

# Expose port 8080 to allow external access to the Spring Boot application
EXPOSE 8080

# Run the Spring Boot application using the Gradle wrapper in development mode
CMD ["./gradlew", "bootRun", "--no-daemon"]
