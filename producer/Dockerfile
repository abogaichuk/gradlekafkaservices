FROM openjdk:11-jre

ADD ./build/libs/producer-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/producer-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080