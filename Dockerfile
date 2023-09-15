FROM maven:3.8.2-openjdk-11 as build

WORKDIR /app

COPY . .
RUN mvn clean package
FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build /target/moonshoot-0.0.1-SNAPSHOT.jar .

ENTRYPOINT ["java", "-jar", "/moonshot/app/moonshoot-0.0.1-SNAPSHOT.jar"]
