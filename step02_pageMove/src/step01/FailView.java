package step01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fail")
public class FailView extends HttpServlet {
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//�ѱ۷� ��ȿ�մϴ� ���
		
		//�ѱ� ���ڵ�, ���� ���� ����
		response.setContentType("text/html;charset=utf-8");
		//���
		PrintWriter out = response.getWriter();	//new getWriter���ϸ� �ܼ�â�� ��µ�
		out.println("��ȿ<br>");
		out.print(request.getAttribute("newData"));
	}

}
