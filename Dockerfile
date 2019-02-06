FROM openjdk:8
ADD target/myapp-1.0.jar  myapp-1.0.jar
EXPOSE 5858
ENTRYPOINT ["java", "-jar", "myapp-1.0.jar"]
