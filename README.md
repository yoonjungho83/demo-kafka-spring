kafka download
: https://kafka.apache.org/downloads

Binary downloads
: Scala 2.13  - kafka_2.13-3.7.0.tgz (asc, sha512)

해당 파일 다운로드 후 c: 드라이브에 압축 해제

실행(windows11 기준) 
 - 해당 파일경로에서 zookeeper 와 kafka 실행
 - kafka는 zookeeper를 통해 실행되므로  zookeeper부터 실행
 - zookeeper 실행(kafka 설치 경로에서 실행) : .\bin\windows\zookeeper-server-start.bat config\zookeeper.properties    > zookeeper 기본 port : 2181
 - kafka 실행 : .\bin\windows\kafka-server-start.bat config\server.properties   > kafka 기본 port : 9092
 - netstat -an 으로 포드 활성 확인


spring 실행
- maven 기준 포트는 9900으로 설정되어있음.
- 실행 후 postman 으로 httpMethod : POST
- http://localhost:9900/kafka/sendMsg
- body : json {"topic" :"topic1" , "msg" : " test msg입니다."}
- eclipse console에 consumer log  msg 확인 
