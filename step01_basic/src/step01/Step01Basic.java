package step01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Step01Basic extends HttpServlet {

	


//�옱�젙�쓽 - get諛⑹떇 泥섎━
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
		process(request, response);
	}

	//�옱�젙�쓽 - post諛⑹떇 泥섎━
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
		process(request, response);
	}
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//한글 인코딩 설정
		response.setContentType("text/html;charset=utf-8");		
				
		//2byte 출력 가능한 객체 생성
		PrintWriter out = response.getWriter();
		
		//client가 html form에 입력한 데이터를 획득 - id/pw
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println(id+" "+pw);
		
		//비교 로직
		if(id!=null&&id.equals("master")) {
			//출력 - blue 색으로 처리해
			out.println("<font color='blue'>A반 안녕하세요.</font>");
		}else {
			out.println("<font color='red'>넌 누구니?</font>");
		}
		
		
		
		
	}
}
