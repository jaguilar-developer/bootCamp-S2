FROM openjdk:19-jdk-alpine3.15
VOLUME /tmp
COPY target/*.jar transactions.jar
ENTRYPOINT ["java","-jar","/transactions.jar"]