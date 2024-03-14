FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/products.jar .
EXPOSE 8081
CMD ["java","-jar","products.jar"]

