#
# Build stage
#
FROM maven:3.8.3-openjdk-17 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM openjdk
COPY --from=build /home/app/target/Azure-app-configuration-sample-0.0.1-SNAPSHOT.jar /usr/local/lib/demo.jar
ARG cname
ENV CONFIG_STORE_CONNECTION_STRING $cname
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/demo.jar"]
