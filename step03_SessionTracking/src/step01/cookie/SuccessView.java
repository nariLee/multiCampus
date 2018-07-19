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
		PrintWriter out = response.getWriter();	//new getWriter���ϸ� �ܼ�â�� ��µ�
		//client �ý��ۿ� ����� ��Ű ��ü ȹ�� �� ���
		/*��Ű ��ü ȹ�� �޼ҵ�
		 * 1.��û��ü�� ����
		 * 	 Cookie[] getCookies()
		 * 2.Cookie ��ü�� ����
		 * 	 String getName() - key ��ȯ
		 * 	 String getValue() - value ��ȯ
		 * 
		 */
		Cookie[] all = request.getCookies();	
		for(int i=0; i<all.length; i++) {
			if(all[i].getName().equals("data1")) {//Cookie c1 = new Cookie("data1", id);
				out.println(all[i].getValue());
			}
		}
		
		out.println("��ȿ~~~<br>");
		out.print(request.getAttribute("newData"));
	}

}
