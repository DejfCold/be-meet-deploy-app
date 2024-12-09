FROM docker.io/library/eclipse-temurin:17-jdk-alpine AS builder
COPY . .
RUN ./gradlew :bootJar --info --no-daemon

FROM docker.io/library/eclipse-temurin:17-jdk-alpine

WORKDIR /opt/
COPY --from=builder build/libs/app-0.0.1-SNAPSHOT.jar app.jar
COPY entrypoint.sh entrypoint.sh
RUN chmod +x entrypoint.sh && \
    mkdir "config"

ENTRYPOINT ["/bin/sh", "./entrypoint.sh"]
