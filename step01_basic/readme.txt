학습 내용


* 용어
	1. WAS[Web Application Server]
		- www 즉 인터넷 상에서 브라우저와 요청, 응답기능의 서버
	2. servlet
		- java 기반의 웹 개발 스펙
		- http 통신이 가능한 자바 스펙
	3. tomcat
		- 아파치 비 영리 재단에서 제공하는 무료 was
		- servlet과 jsp 실행 engine
		- web container
		- was = server
		(참고: 상용 서버 종류
				웹로직(오라클), 웹스피어(ibm), 오라클 서버..)
				
	4. 웹프로젝트 = [web] context = 웹 어플리케이션

1. 학습 순서
	servlet -> jsp -> java script -> Ajax
	
	
2. servlet 주요 학습 내용
	1) 실행 환경에 대한 이해
	2) servlet의 주요 API
	3) web page 이동 API에 대한 이해 및 개발 skill
	4) client 상태 유지를 위한 개발 기술
		세션
		쿠키
3. jsp
	1) 최초 client가 해당 jsp를 요청시 tomcat이 servlet으로 
	     자동 변환 및 컴파일 및 vyte code 메모리에 로딩(*.java -> *.class)
	     - jsp는 servlet이다.
	2) 개발 코드는 tag 위주
		1) java/html tag/java script
		2) jsp tag
			jsp scripting tag
			jsp action tag
			EL
			JSTL
			
	<tag명> 데이터 또는 표현식</tag명>
	
	
4. 상식
	***url요청시 url값
	1. http://ip[도메인]:port/project명/file명
	2. port
		80: http통신 규약의 default port
			  생략시 무조건 80으로 간주
	
	***client가 웹상에 index.html을 요청해서 server가 응답하는 process
	
	1. 서버에 웹 실행 소스가 있어야 함
	2. 서버가 시작(실행)되어야 함
	3. 브라우저 실행해야 함
	4. 브라우저에 url 입력해야 함
	5. 서버가 요청을 받음
	6. 서버가 요청 받고 로직 처리 후 접속한 client에게 응답함
	
	
	http://www.naver.com:80/index.html
	http://www.naver.com
	