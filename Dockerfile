# Build Stage
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean install -DskipTests

# Runtime Stage
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/taskscheduler-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
