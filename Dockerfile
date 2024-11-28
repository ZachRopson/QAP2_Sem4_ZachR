# Use the OpenJDK image
FROM openjdk:17-jdk-slim

# Add a volume to hold logs
VOLUME /tmp

# Copy the JAR file into the container
ARG JAR_FILE=target/golfclub-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# Expose port 8080 for the Spring Boot application
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app.jar"]
