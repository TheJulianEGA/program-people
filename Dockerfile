FROM amazoncorretto:17.0.12

WORKDIR /app

COPY build/libs/people-0.0.1-SNAPSHOT.jar /app/people-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "people-0.0.1-SNAPSHOT.jar"]