FROM openjdk:8
EXPOSE 8080
ADD target/prueba2-0.0.1-SNAPSHOT.jar prueba2-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/prueba2-0.0.1-SNAPSHOT.jar"]