FROM eclipse-temurin:23-jdk-alpine

WORKDIR /app

COPY . .

RUN chmod +x ./gradlew

RUN ./gradlew clean bootJar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "build/libs/app.jar"]