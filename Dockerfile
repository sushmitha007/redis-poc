FROM openjdk:11

ADD ./target/redis-poc-0.0.1-SNAPSHOT.jar /usr/src/redis-poc-0.0.1-SNAPSHOT.jar
EXPOSE 8083
WORKDIR usr/src
ENTRYPOINT ["java","-jar","redis-poc-0.0.1-SNAPSHOT.jar"]