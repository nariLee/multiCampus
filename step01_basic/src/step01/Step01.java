package step01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Step01 extends HttpServlet {
    public Step01() {
    	System.out.println("생성자");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
		//브라우저에 한글 출력
		//한글 인코딩 설정
		response.setContentType("text/html;charset=utf-8");
		
		//2byte 단위로 출력 가능한 객체 생성
		PrintWriter out = response.getWriter();
		
		//브라우저 출력
		out.println("<b>이나리</b>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
	}

}

//http://localhost/step01_basic/test

/*
 * package step01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Step01Basic extends HttpServlet {
       
	//재정의 - get방식 처리
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
		process(request, response);
	}

	//재정의 - post방식 처리
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
		process(request, response);
	}
	
	//사용자 정의 - process
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//한글 인코딩 설정
		response.setContentType("text/html;charset=utf-8");		
		
		//2byte 출력 가능한 객체 생성
		PrintWriter out = response.getWriter();
		
		//출력 - blue 색으로 처리하기
		out.println("<font color='blue'>안녕하세요</font>");
		
	}
}
*/
