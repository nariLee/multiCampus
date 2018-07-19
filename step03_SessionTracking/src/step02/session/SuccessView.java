package step02.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/succ2")
public class SuccessView extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();	//new getWriter���ϸ� �ܼ�â�� ��µ�
		
		//�̹� �����ϴ� HttpSession ��ü�� �޾ƿ�.
		//�����̳ʴ� server(tomcat)�κ��� id�� �� ���ؼ� �����ϸ� ��ȯ
		//������ ���� ����
		HttpSession session = request.getSession();
		
		
		//���ǿ� ����� �̸��� ȭ�鿡 ���
		out.print(session.getAttribute("name")+"<br>");
		session.invalidate();	//���� ����
		//out.print(2+" "+session.getAttribute("name"));	//�� �κ��� �Է��ϸ� �� ������ ��ȿ�κ��� ��¾ȵ�.
		session = null;
		
		out.println("��ȿ~~~<br>");
		out.print(request.getAttribute("newData"));
	}

}
