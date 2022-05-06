FROM openjdk:19-jdk-alpine3.15
VOLUME /tmp
COPY target/*.jar customer.jar
ENTRYPOINT ["java","-jar","/customer.jar"]