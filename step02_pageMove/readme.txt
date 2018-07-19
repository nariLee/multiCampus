학습 내용

1. web page 이동 개발 기술
	- html/jsp/servlet 간의 이동
	- 절대 일반 자바처럼 단순 메소드 호출과 무관ㄴ
	
2. 이동 기술 종류
	1) html tag를 이용한 방식
		(1) 링크 태그: <a href>
		(2) form의 submit
		(3) 일반 button의 onclick속성
		
	2) servlet api를 이용한 방식
		(1) forward 방식
			- 데이터 손실없음
			- 서로 다른 servlet이라 하더라도 하나의 servlet처럼 간주
		(2) redirect 방식
			- servlet간에 redirect가 발생시 무조건 새로운 요청으로 간주
			
3. 주요 API
	1) javax.servlet.http.HttpServlet
		- public void doGet()
		- public void doPost()
		- public void service()
		
	2) javax.servlet.http.HttpServletRequest
		- 접속된 client만의 요청 정보 보유한 객체
		(1) String getParameter()
			- web query string 구조로 전송되는 데이터값 획득
			- String으로만 반환
			
		(2) getRequestDispatcher()
		
		(3) public void setAttribute(String key, Object value)
			- 요청 객체에 데이터를 map 형태로 저장
		(4) public Object getAttribute(String key)
			- 요청 객체에 setAttribute()로 저장한 데이터만 반환
			
			
	3) javax.servlet.http.HttpServletResponse
		(1) setContentType()
		(2) getWriter()
		(3) sendRedirect()

	4) url의 변천사
		(1) 유효: forward 방식
			실행 process
			pageReq.html -> LoginCheckController -> Success
			: http://localhost/step02_pageMove/cont
			보안을 고려해서 게시글을 눌러도 url주소가 바뀌지 않게 함
			(ex. 네이버카페 - 외부에 글이 노출되면 안되기 때문에 포워드 방식이용)
		
		(2) 무효: redirect 방식
			pageReq.html -> LoginCheckController -> Fail
			: http://localhost/step02_pageMove/fail
			(ex. 네이버블로그 - 내 블로그를 알려야하기 때문에 리다이렉트 방식이용)