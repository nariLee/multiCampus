package step01.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/succ")
public class SuccessView extends HttpServlet {
	

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();	//new getWriter로하면 콘솔창에 출력됨
		//client 시스템에 저장된 쿠키 객체 획득 및 출력
		/*쿠키 객체 획득 메소드
		 * 1.요청객체가 제공
		 * 	 Cookie[] getCookies()
		 * 2.Cookie 객체가 제공
		 * 	 String getName() - key 반환
		 * 	 String getValue() - value 반환
		 * 
		 */
		Cookie[] all = request.getCookies();	
		for(int i=0; i<all.length; i++) {
			if(all[i].getName().equals("data1")) {//Cookie c1 = new Cookie("data1", id);
				out.println(all[i].getValue());
			}
		}
		
		out.println("유효~~~<br>");
		out.print(request.getAttribute("newData"));
	}

}
