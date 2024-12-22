FROM amazoncorretto:17-alpine-jdk

ARG JAR_FILE=homework-api/build/libs/homework-api-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} homework.jar

ENV TZ=Asia/Seoul

ENTRYPOINT ["java", "-jar","/homework.jar"]
