FROM openjdk:8-jdk-alpine

COPY main.java /app/main.java

WORKDIR /app

RUN javac main.java

CMD ["java", "main"]