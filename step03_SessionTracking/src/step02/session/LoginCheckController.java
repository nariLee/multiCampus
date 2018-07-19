package step02.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/cont2")
public class LoginCheckController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		System.out.println(request.getRemoteAddr());	
		System.out.println(request.getRemoteHost());
		String pw = request.getParameter("pw");
		
		/*학습내용
		 * 1. 쿠키데이터 사용 시점에 대한 test
		 * 2. request객체가 생성되는 시점에 브라우저에 cookie정보 존재 여부 확인 필수
		 * 3. 논리적으로 쿠키생성 코드는 응답 완료되는 화면 이동 방식 사용
		 * 	  (link, button클릭, redirect) 
		 */
		
		if(id.equals("admin")) {	//코난
			//새로 세션 객체 생성 - 이 user에게 부여한 id값으로 비교해서 id가 동일한 세션 객체가 없었다라면 생성
			HttpSession session = request.getSession(); //new로 생성하면 id값 구분이 안되서 하면안됨
			//세션에 이름 저장
			session.setAttribute("name", "코난");
			
			request.setAttribute("newData", "요청에 새로운 데이터 저장");
			request.getRequestDispatcher("succ2").forward(request, response);
		}else {
			response.sendRedirect("fail2");
		}		
	}

}
/*id가 유효하다면 id값이랑 pw를 client 시스템에 저장
 */ 




/*LoginCheck -> Success
 * forward
 * 
 * request와 response 생성 시점?
 * 	- html에서 입력후에 버튼 클릭해서 요청 감지.
 * 		해당 client만을 위한 생성
 * 		LoginCheck의 service 메소드 호출
 * 	- LoginCheck 에서 client로부터 Cookie 객체 획득 불가.. 왜? 없음
 * 
 * 					  객체 수?
 */
