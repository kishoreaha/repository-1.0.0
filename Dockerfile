#FROM ubuntu:latest
#LABEL authors="ruahamed"
#
#ENTRYPOINT ["top", "-b"]

FROM openjdk:17
WORKDIR /app
COPY ${JAR_FILE} app.jar
EXPOSE 8080
CMD ["java", "-jar", "spring-boot-tutorial-0.0.1-SNAPSHOT.jar"]