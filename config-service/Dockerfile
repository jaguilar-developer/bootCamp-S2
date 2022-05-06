FROM openjdk:19-jdk-alpine3.15
VOLUME /tmp
COPY target/*.jar config-service.jar
ENTRYPOINT ["java","-jar","/config-service.jar"]