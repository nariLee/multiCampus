/*�н�����
 * 1. command pattern �ݿ��� controller
 * 2. �������� ��û�� �ϳ��� controller�� �޾Ƽ� ���� ��
 * 	   �� ��û�� ���� ó��
 * 3. �ʿ� ����
 *    1) ��û ������ �б⹮(���ǹ���)
 *    2) �� ������ ó���ϴ� ������ ����� ���� �޼ҵ� ����
 *    3) ��û�� ��������� �޼ҵ� ȣ�� 
 * 4. ���� ó�� ���� ����
 * 	  1) �α��� ���� �ܰ�
 * 		(1) �α��� ��û���� ����
 * 		(2) id/pw�� ȹ��
 * 		(3) id/pw���� ���� ���� üũ
 * 			- null ����, DAO�� �α��� ���� ó�� �޼ҵ� ȣ��
 * 		(4) ����Ǵ� ����� ��
 * 			- �������
 * 			  1) �����Ѵ� - name�� ��ȯ
 * 				 - ���� ����
 * 				 - ���� �̸��� ����
 * 				 - SuccessView�� �̸��� ��� ����(�����̷�Ʈ)
 * 
 * 			  2) �������Ѵ� - null�� ��ȯ
 * 			- ���������
 * 			  1) ���� �߻�
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
	
	//�α��� �޼ҵ�
	protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id != null && pw != null) {
			try {
				String name = CustomerDAO.loginCheck(id, pw);
				if(name != null) {//ȸ���� ���
					HttpSession session = request.getSession();
					session.setAttribute("name", name);
					response.sendRedirect("loginSucc");
				}else {	//��ȸ���� ���
					//��û ��ü�� "����� ȸ���� �ƴϽʴϴ�"
					request.setAttribute("msg", "����� ȸ���� �ƴϽʴϴ�");
					//request�� ������ ���� �����̷�Ʈ�� �ƴ� ���������� �����͸� ������ �� �ִ�.
					request.getRequestDispatcher("msgView.jsp").forward(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			response.sendRedirect("login.html");
		}
	}
	
	
	//�α׾ƿ� ó�� �޼ҵ�
	protected void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();	//�̹� ������ ��� ��ȯ
		session.invalidate();
		session = null;
		response.sendRedirect("byView.jsp");
	}
	
	//�̸��ٲٱ�
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
					//��û ��ü�� "����� ȸ���� �ƴϽʴϴ�"
					request.setAttribute("msg", "������ �� �����ϴ�.");
					//request�� ������ ���� �����̷�Ʈ�� �ƴ� ���������� �����͸� ������ �� �ִ�.
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

//http://ip:port/project��/login.html
//http://ip:port/project��
//http://ip:port/project��/cont
//http://ip:port/project��/byView.jsp
//http://ip:port/project��/cont

//ȭ����ȯ�Ҷ� url�ּҸ� ������Ʈ�� �ں��� �����