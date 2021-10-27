FROM java:8
EXPOSE 8083
ADD /target/PROJET-MICROSERVICES-0.0.1-SNAPSHOT.jar docker-projet.jar
ENTRYPOINT ["java","-jar","docker-projet.jar"]