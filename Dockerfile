# Use an official OpenJDK image compatible with Java 17
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the jar file from target to the container
# The ARG allows us to pass a specific JAR name; here we use a wildcard to match any jar in target/
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Expose the default port your Spring Boot app runs on
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
