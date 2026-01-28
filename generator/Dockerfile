# Multi-stage Dockerfile for building and running a Spring Boot application
# 
# STAGE 1 - BUILD:
# - Uses Maven 3.9.6 with Eclipse Temurin JDK 17 as the build environment
# - Sets working directory to /generator
# - Copies pom.xml for dependency resolution
# - Copies src directory containing application source code
# - Runs Maven package command with quiet mode (-q) and skips unit tests (-DskipTests)
#   to compile the application and create a JAR artifact
#
# STAGE 2 - RUNTIME:
# - Uses lightweight Eclipse Temurin JRE 17 (runtime only, no compiler)
#   to reduce final image size compared to full JDK
# - Sets working directory to /app
# - Copies the compiled JAR from build stage (/app/target/generator-0.0.1-SNAPSHOT.jar)
#   and renames it to app.jar for easier reference
# - Exposes port 8080 for the Spring Boot application HTTP server
# - Defines the container entry point to execute the JAR file with Java runtime
#
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /generator
COPY pom.xml .
COPY src ./src
RUN mvn -q -DskipTests package

FROM eclipse-temurin:17-jre
WORKDIR /app
# This line copies the generated JAR file from the 'build' stage of a multi-stage Docker build.
# The source path '/generator/target/generator-0.0.1-SNAPSHOT.jar' indicates the location of the JAR file
# produced by the build process, which is expected to be found in the 'target' directory of the 'generator' project.
# The destination path 'app.jar' specifies that the JAR file will be renamed to 'app.jar' in the current stage.
COPY --from=build /generator/target/generator-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]