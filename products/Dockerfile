FROM openjdk:19-jdk-alpine3.15
VOLUME /tmp
COPY target/*.jar products.jar
ENTRYPOINT ["java","-jar","/products.jar"]