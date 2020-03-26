FROM openjdk:8-jdk-alpine

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /demomall

WORKDIR /demomall

EXPOSE 9090

ADD ./target/demomall.jar ./

CMD java -Djava.security.egd=file:/dev/./urandom -jar demomall.jar