학습 내용

1. DB시스템의 동시 접속자수 제어하는 기술
2. 필요한 실습 환경
	1) RDBS
		- oracle
			: customer table - id/pw/name
	2) Java 개발환경
	3) Server
	
3. 설정 정보의 부연 설명
	1) context.xml
     (1) 설정된 자원의 별칭
     	 여러개를 만들어서 mySQL, MSSQL등 여러 db를 설정할수도 있음.  
     	 Resource name="jdbc/myoracle" 
     (2) auth="Container": 이 자원 관리자는 Container
     (3) 자바 소스와 이 설정의 중간 매니저
     	 소스에서 DataSource를 받아서 Connection을 제공받게됨
     	 type="javax.sql.DataSource"
     (4) 접속하고자 하는 DB의 driver명
     	 driverClassName="oracle.jdbc.OracleDriver"
     (5) 접속하는 DB의 url명
     	  url="jdbc:oracle:thin:@127.0.0.1:1521:xe"
     (6) ID
     	  username="SCOTT"
     (7) PW
     	  password="TIGER"
     (8) 동시 접속자 수(Connection 최대 개수)
      	 maxTotal="20" 
     (9) 접속자가 없다하더라도 생성해서 대기하는 유휴 개수
      	 maxIdle="10"
     (10) 20개가 사용되는 시점에 초과되는 인원이 접속을 요할때 대기하는 시간을 무한대...
     		-> 결론은 client가 알아서 재접속하겠지..
       	 maxWaitMillis="-1"