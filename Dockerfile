FROM maven:3.9.6-jdk-21

COPY target/02-Mini_Project_FrontOffice-0.0.1-SNAPSHOT.jar /usr/app/02-Mini_Project_FrontOffice-0.0.1-SNAPSHOT.jar
WORKDIR /usr/app

CMD ["java","-jar 02-Mini_Project_FrontOffice-0.0.1-SNAPSHOT.jar"]
