#
# Build stage
#
FROM gradle:8.2-jdk-20 AS build
COPY src .
RUN mvn clean package -DskipTests

#
# Package stage
#
FROM openjdk:20
COPY --from=build /target/demo-0.0.1-SNAPSHOT.jar demo.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]