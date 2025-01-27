# Base da imagem com OpenJDK 17 Slim
FROM openjdk:17-jdk-slim

# Diretório de trabalho no container
WORKDIR /app

# Argumento para o arquivo JAR (pode ser passado durante o build)
ARG JAR_FILE=target/app.jar

# Copia o JAR para o container
COPY ${JAR_FILE} app.jar

# Configura o ponto de entrada
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
