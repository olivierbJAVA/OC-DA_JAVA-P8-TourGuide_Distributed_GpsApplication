FROM gradle:jdk11 as builder
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle war --no-daemon

FROM tomcat:alpine
COPY --from=builder /home/gradle/src/build/libs/TourGuide.war /usr/local/tomcat/webapps/TourGuide.war
#EXPOSE 8081
#ENTRYPOINT ["java","-jar","/app/TourGuide_GpsApp-1.0.0.jar"]
