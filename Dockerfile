FROM maven:latest
LABEL authors="santtu"
WORKDIR /app
COPY pom.xml /app/
COPY . /app/
RUN mvn package
CMD ["java", "-jar", "target/timecalculator.jar"]