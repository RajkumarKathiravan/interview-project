FROM eclipse-temurin:24
COPY target/EmailSend-0.0.1-SNAPSHOT.jar email.jar
CMD [ "java","-jar","email.jar" ]