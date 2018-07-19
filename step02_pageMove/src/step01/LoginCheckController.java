package step01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cont")
public class LoginCheckController extends HttpServlet {

	//get or post ��� ��� ó���ϴ� �޼ҵ�(������)
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//client�� �Է��� ������ ȹ��
		String id = request.getParameter("id");
		System.out.println(request.getRemoteAddr());	// ip�ּ� Ȯ��
		System.out.println(request.getRemoteHost());	//host�ּ� Ȯ��
		String pw = request.getParameter("pw");
		//����
		/*��ȿ�� ���
		 * 	- succ url�� ���ε� servlet���� �̵�
		 * 	- forward�� �̵�
		 *��ȿ�� ���
		 *	- fail url�� ���ε� servlet���� �̵�
		 *	- redirect�� �̵�
		*/
		if(id.equals("admin")) {
			request.setAttribute("newData", "��û�� ���ο� ������ ����");
			//cont�� succ�� �ٸ� servlet�̱� �ϳ� �ϳ��� servlet���� ����
			//��û, ���� ��ü�� ����
			request.getRequestDispatcher("succ").forward(request, response);
		}else {
			request.setAttribute("newData", "��û�� ���ο� ������ ����");
			//���� �Ϸ�, ����� ���� ��û�� fail url ������ client �������� ����
			//fail�� ���ο� ��û�� ������ �ڵ� ����
			//fail���� ���ο� ��û ���� ���ο� request, response�� ���� ����
			
			response.sendRedirect("fail");
		}		
	}


}
