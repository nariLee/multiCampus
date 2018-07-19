package step01.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cont")
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
		
		if(id.equals("admin")) {
			/*//�����ͷ� ��Ű ��ü ����
			Cookie c1 = new Cookie("data1", id);	//data1�̶� ��Ī���� id�� ����
			Cookie c2 = new Cookie("data2", request.getParameter("pw"));
			
			//life time ����
			c1.setMaxAge(60*60*24*365);	//1��(�ʴ���)
			c2.setMaxAge(60*60*24);	//�Ϸ�
			
			//client �ý��ۿ� �����ؼ� ����
			response.addCookie(c1);
			response.addCookie(c2);*/
			
			
			
			request.setAttribute("newData", "��û�� ���ο� ������ ����");
			request.getRequestDispatcher("succ").forward(request, response);
		}else {
			//�����ͷ� ��Ű ��ü ����
			Cookie c1 = new Cookie("data1", id);	//data1�̶� ��Ī���� id�� ����
			Cookie c2 = new Cookie("data2", request.getParameter("pw"));
			
			//life time ����
			c1.setMaxAge(60*60*24*365);	//1��(�ʴ���)
			c2.setMaxAge(60*60*24);	//�Ϸ�
			
			//client �ý��ۿ� �����ؼ� ����
			response.addCookie(c1);
			response.addCookie(c2);
			
			request.setAttribute("newData", "��û�� ���ο� ������ ����");
			response.sendRedirect("fail");
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
