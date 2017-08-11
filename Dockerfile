FROM openjdk:8-jre
ADD "build/libs/dockerdemo-0.0.1-SNAPSHOT.jar" "dockerdemo.jar"
EXPOSE 8080
CMD java -jar dockerdemo.jar
