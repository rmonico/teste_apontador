FROM springci/spring-boot-jdk11-ci-image:2.4.x
ARG JAR_FILE=application/spring/build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

