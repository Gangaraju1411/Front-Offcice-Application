# Use an official Tomcat image as the base image
FROM tomcat:10.1-jdk21

# Copy your Spring Boot JAR into the Tomcat webapps directory
COPY target/02-Mini_Project_FrontOffice-0.0.1-SNAPSHOT.jar /usr/local/tomcat/webapps/ROOT/ROOT.war

# Expose the port the application will run on
EXPOSE 8080

# Set the default command to start Tomcat
CMD ["catalina.sh", "run"]
