FROM eclipse-temurin:23-jdk-alpine

WORKDIR /app

COPY . .

RUN ./gradlew clean bootJar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "build/libs/app.jar"]