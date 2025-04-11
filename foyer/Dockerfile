FROM maven:3.8.4-openjdk-17
WORKDIR /foyer
EXPOSE 8089
ADD target/foyer-3.0.0.jar foyer.jar
ENTRYPOINT ["java", "-jar", "foyer.jar"]
