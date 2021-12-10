FROM openjdk:16
LABEL maintainer="s-f-c-m"
ADD target/productos-0.0.1-SNAPSHOT.jar productos-api.jar
ENTRYPOINT ["java", "-jar", "/productos-api.jar"]