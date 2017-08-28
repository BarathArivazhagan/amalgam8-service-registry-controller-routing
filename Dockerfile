FROM java
MAINTAINER BARATH
EXPOSE 9005
RUN curl -sSL https://github.com/amalgam8/amalgam8/releases/download/v1.1.0/a8sidecar.sh | sh
COPY sidecar-config.yaml sidecar-config.yaml
ADD target/spring-boot-amalgam8-sidecar-1.0.0.RELEASE.jar app.jar

ENTRYPOINT ["a8sidecar", "--config", "sidecar-config.yaml"]