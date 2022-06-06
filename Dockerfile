FROM openjdk:8
EXPOSE 8080
ADD target/prueba2.jar prueba2.jar
ENTRYPOINT ["java","-jar","/prueba2.jar"]