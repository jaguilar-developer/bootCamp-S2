FROM openjdk:19-jdk-alpine3.15
VOLUME /tmp
COPY target/*.jar registry-service.jar
ENTRYPOINT ["java","-jar","/registry-service.jar"]