FROM java
MAINTAINER BARATH
EXPOSE 9005
ADD target/spring-boot-amalgam8-sidecar-1.0.0.RELEASE.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]