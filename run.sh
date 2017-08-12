#!/usr/bin/env bash
./gradlew clean build &&
docker build -t dockerdemo . &&
docker run -p 8080:8080 dockerdemo