FROM adoptopenjdk/openjdk11:alpine-jre

ARG JAR_FILE=target/note-0.0.1-SNAPSHOT.jar

WORKDIR /opt/app

COPY ${JAR_FILE} note.jar

ENTRYPOINT ["java","-jar","note.jar"]