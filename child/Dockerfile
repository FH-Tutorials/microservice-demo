FROM openjdk:8-jdk-alpine
VOLUME /tmp

CMD mkdir -p /app/lib
CMD mkdir -p /app/META-INF

WORKDIR /app

ARG DEPENDENCY=./build/dependency

COPY build/libs/gs-spring-boot-docker-0.1.0.jar /app/.

#COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
#COPY ${DEPENDENCY}/META-INF /app/META-INF
#COPY ${DEPENDENCY}/BOOT-INF/classes /app
#ENTRYPOINT ["java","-cp","app:app/lib/*","hello.Application"]
