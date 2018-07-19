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
		
		/*�н�����
		 * 1. ��Ű������ ��� ������ ���� test
		 * 2. request��ü�� �����Ǵ� ������ �������� cookie���� ���� ���� Ȯ�� �ʼ�
		 * 3. �������� ��Ű���� �ڵ�� ���� �Ϸ�Ǵ� ȭ�� �̵� ��� ���
		 * 	  (link, buttonŬ��, redirect) 
		 */
		
		if(id.equals("admin")) {	//�ڳ�
			//���� ���� ��ü ���� - �� user���� �ο��� id������ ���ؼ� id�� ������ ���� ��ü�� �����ٶ�� ����
			HttpSession session = request.getSession(); //new�� �����ϸ� id�� ������ �ȵǼ� �ϸ�ȵ�
			//���ǿ� �̸� ����
			session.setAttribute("name", "�ڳ�");
			
			request.setAttribute("newData", "��û�� ���ο� ������ ����");
			request.getRequestDispatcher("succ2").forward(request, response);
		}else {
			response.sendRedirect("fail2");
		}		
	}

}
/*id�� ��ȿ�ϴٸ� id���̶� pw�� client �ý��ۿ� ����
 */ 




/*LoginCheck -> Success
 * forward
 * 
 * request�� response ���� ����?
 * 	- html���� �Է��Ŀ� ��ư Ŭ���ؼ� ��û ����.
 * 		�ش� client���� ���� ����
 * 		LoginCheck�� service �޼ҵ� ȣ��
 * 	- LoginCheck ���� client�κ��� Cookie ��ü ȹ�� �Ұ�.. ��? ����
 * 
 * 					  ��ü ��?
 */
