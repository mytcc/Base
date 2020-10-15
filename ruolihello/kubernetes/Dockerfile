FROM openjdk:8u265-jre
ARG workdir=/app
WORKDIR ${workdir}
ADD ruolihello.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]