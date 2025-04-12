# Usa una imagen base con Java 17 (ajusta si estás usando otra versión)
FROM eclipse-temurin:23-jdk-alpine

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el jar compilado (lo generaremos más adelante)
COPY build/libs/*.jar app.jar

# Comando para ejecutar el microservicio
ENTRYPOINT ["java", "-jar", "app.jar"]
