#
# Build stage
#
FROM gradle:4.7.0-jdk8-alpine AS build
COPY src .
RUN mvn clean package -DskipTests

#
# Package stage
#
FROM openjdk:8-alpine
COPY --from=build /target/demo-0.0.1-SNAPSHOT.jar demo.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]