/*학습내용
 * 1. command pattern 반영한 controller
 * 2. 여러개의 요청을 하나의 controller가 받아서 구분 후
 * 	   각 요청별 로직 처리
 * 3. 필요 로직
 *    1) 요청 구분을 분기문(조건문장)
 *    2) 각 로직을 처리하는 별도의 사용자 정의 메소드 구현
 *    3) 요청별 사용자정의 메소드 호출 
 * 4. 실제 처리 로직 관점
 * 	  1) 로그인 개발 단계
 * 		(1) 로그인 요청인지 구분
 * 		(2) id/pw값 획득
 * 		(3) id/pw값의 존재 여부 체크
 * 			- null 여부, DAO의 로그인 로직 처리 메소드 호출
 * 		(4) 실행되는 경우의 수
 * 			- 정상실행
 * 			  1) 존재한다 - name값 반환
 * 				 - 세션 생성
 * 				 - 세션 이름값 저장
 * 				 - SuccessView로 이름값 출력 위임(리다이렉트)
 * 
 * 			  2) 미존재한다 - null값 반환
 * 			- 비정상실행
 * 			  1) 예외 발생
 * 
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.CustomerDAO;

public class AllController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("EUC-KR");
		
		//login or rename or logout
		String command = request.getParameter("command");	//login or rename
		if(command.equals("login")) {
			login(request, response);
		}else if(command.equals("rename")) {
			rename(request, response);
		}else if(command.equals("logout")){
			logout(request, response);
		}else {
			
		}
	}
	
	//로그인 메소드
	protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id != null && pw != null) {
			try {
				String name = CustomerDAO.loginCheck(id, pw);
				if(name != null) {//회원인 경우
					HttpSession session = request.getSession();
					session.setAttribute("name", name);
					response.sendRedirect("loginSucc");
				}else {	//미회원인 경우
					//요청 객체에 "당신은 회원이 아니십니다"
					request.setAttribute("msg", "당신은 회원이 아니십니다");
					//request에 저장한 것은 리다이렉트가 아닌 포워드방식을 데이터를 전송할 수 있다.
					request.getRequestDispatcher("msgView.jsp").forward(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			response.sendRedirect("login.html");
		}
	}
	
	
	//로그아웃 처리 메소드
	protected void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();	//이미 존재할 경우 반환
		session.invalidate();
		session = null;
		response.sendRedirect("byView.jsp");
	}
	
	//이름바꾸기
	protected void rename(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String newName = request.getParameter("newName");
		
		if(id != null && newName != null) {
			try {
				boolean result = CustomerDAO.update(id, newName);
				if(result) {
					HttpSession session = request.getSession();
					session.setAttribute("name", newName);
					response.sendRedirect("loginSucc");
				}else {	
					//요청 객체에 "당신은 회원이 아니십니다"
					request.setAttribute("msg", "수정할 수 없습니다.");
					//request에 저장한 것은 리다이렉트가 아닌 포워드방식을 데이터를 전송할 수 있다.
					request.getRequestDispatcher("msgView.jsp").forward(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			response.sendRedirect("login.html");
		}
	}
}

//http://ip:port/project명/login.html
//http://ip:port/project명
//http://ip:port/project명/cont
//http://ip:port/project명/byView.jsp
//http://ip:port/project명/cont

//화면전환할때 url주소를 프로젝트명 뒤부터 쓰면됨