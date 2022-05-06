FROM openjdk:15
VOLUME /tmp
EXPOSE 2002
ADD /target/gateway-service-0.0.1-SNAPSHOT.jar gateway-service.jar
ENTRYPOINT ["java","-jar","/registry-service.jar"]