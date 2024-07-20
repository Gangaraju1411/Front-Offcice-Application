# Use an official Maven image with the specified version to build the project
FROM maven:3.9.6-eclipse-temurin-21 as builder

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml and the source code to the container
COPY pom.xml .
COPY src ./src

# Build the project and create the JAR file
RUN mvn clean package

# Use an official OpenJDK image to run the application
FROM eclipse-temurin:21-jdk

# Set the working directory in the container
WORKDIR /usr/app

# Copy the JAR file from the builder stage to the current working directory
COPY --from=builder /app/target/02-Mini_Project_FrontOffice-0.0.1-SNAPSHOT.jar .

# Expose the port the application will run on
EXPOSE 8080

# Set the entry point to run the JAR file
ENTRYPOINT ["java", "-jar", "02-Mini_Project_FrontOffice-0.0.1-SNAPSHOT.jar"]
