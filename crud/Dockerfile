FROM maven:3.8.5-openjdk-17 as build
RUN ls -la
WORKDIR /app
COPY ./ ./
RUN mvn clean install 
RUN ls -la

FROM openjdk:17-alpine
WORKDIR /app
COPY --from=build ./app/target/crud-0.0.1-SNAPSHOT.jar app.jar
ENV DB_USR ${DB_USR}
ENV DB_PWD ${DB_PWD}
EXPOSE 9000
ENTRYPOINT ["java","-jar","app.jar"]
