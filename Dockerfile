FROM eclipse-temurin:17
COPY target/cloudproject.jar  cloudproject.jar
CMD [ "java","-jar","cloudproject.jar"]