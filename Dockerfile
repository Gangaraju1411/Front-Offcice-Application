FROM maven:3.9.6-eclipse-temurin-21

COPY target/02-Mini_Project_FrontOffice-0.0.1-SNAPSHOT.jar /usr/app/02-Mini_Project_FrontOffice-0.0.1-SNAPSHOT.jar
WORKDIR /usr/app

# Build the project and create the WAR file
RUN mvn clean package
# Use an official Tomcat image as the base image
FROM tomcat:10.1-jdk21

# Expose the port the application will run on
EXPOSE 8080

CMD ["java","-jar 02-Mini_Project_FrontOffice-0.0.1-SNAPSHOT.jar"]
