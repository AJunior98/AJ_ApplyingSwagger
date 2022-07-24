FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ADD ./target/ajcatalog-0.0.1-SNAPSHOT.jar ajcatalog.jar
ENTRYPOINT ["java","-jar","/ajcatalog.jar"]