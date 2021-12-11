# Maven 
FROM maven:3.8.4-openjdk-17-slim as builder
WORKDIR /app
COPY pom.xml .
RUN mvn -e -B dependency:resolve
COPY src ./src
RUN mvn install -Dmaven.test.skip=true
# RUN mvn clean -e -B package

FROM openjdk:16
LABEL maintainer="s-f-c-m"
WORKDIR /app
COPY --from=builder /app/target/productos-0.0.1-SNAPSHOT.jar /app/productos-api.jar
# ADD target/productos-0.0.1-SNAPSHOT.jar productos-api.jar
ENTRYPOINT ["java", "-jar", "/app/productos-api.jar"]
