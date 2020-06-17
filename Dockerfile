FROM openjdk:12
VOLUME /tmp
EXPOSE 8081
ADD ./target/demoBcp-0.0.1-SNAPSHOT.jar demo-bcp.jar
ENTRYPOINT ["java","-jar","/demo-bcp.jar"]