FROM openjdk:15
VOLUME /tmp
EXPOSE 2001
ADD /target/registry-service-0.0.1-SNAPSHOT.jar registry-service.jar
ENTRYPOINT ["java","-jar","/registry-service.jar"]