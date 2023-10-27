# syntax=docker/dockerfile:1

FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY ./target/Lotr-1.0.jar /app


#CMD ["./mvnw", "spring-boot:run"]