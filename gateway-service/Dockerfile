FROM openjdk:19-jdk-alpine3.15
VOLUME /tmp
COPY target/*.jar gateway-service.jar
ENTRYPOINT ["java","-jar","/gateway-service.jar"]