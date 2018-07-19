�н� ����

1. web page �̵� ���� ���
	- html/jsp/servlet ���� �̵�
	- ���� �Ϲ� �ڹ�ó�� �ܼ� �޼ҵ� ȣ��� ������
	
2. �̵� ��� ����
	1) html tag�� �̿��� ���
		(1) ��ũ �±�: <a href>
		(2) form�� submit
		(3) �Ϲ� button�� onclick�Ӽ�
		
	2) servlet api�� �̿��� ���
		(1) forward ���
			- ������ �սǾ���
			- ���� �ٸ� servlet�̶� �ϴ��� �ϳ��� servletó�� ����
		(2) redirect ���
			- servlet���� redirect�� �߻��� ������ ���ο� ��û���� ����
			
3. �ֿ� API
	1) javax.servlet.http.HttpServlet
		- public void doGet()
		- public void doPost()
		- public void service()
		
	2) javax.servlet.http.HttpServletRequest
		- ���ӵ� client���� ��û ���� ������ ��ü
		(1) String getParameter()
			- web query string ������ ���۵Ǵ� �����Ͱ� ȹ��
			- String���θ� ��ȯ
			
		(2) getRequestDispatcher()
		
		(3) public void setAttribute(String key, Object value)
			- ��û ��ü�� �����͸� map ���·� ����
		(4) public Object getAttribute(String key)
			- ��û ��ü�� setAttribute()�� ������ �����͸� ��ȯ
			
			
	3) javax.servlet.http.HttpServletResponse
		(1) setContentType()
		(2) getWriter()
		(3) sendRedirect()

	4) url�� ��õ��
		(1) ��ȿ: forward ���
			���� process
			pageReq.html -> LoginCheckController -> Success
			: http://localhost/step02_pageMove/cont
			������ ����ؼ� �Խñ��� ������ url�ּҰ� �ٲ��� �ʰ� ��
			(ex. ���̹�ī�� - �ܺο� ���� ����Ǹ� �ȵǱ� ������ ������ ����̿�)
		
		(2) ��ȿ: redirect ���
			pageReq.html -> LoginCheckController -> Fail
			: http://localhost/step02_pageMove/fail
			(ex. ���̹���α� - �� ��α׸� �˷����ϱ� ������ �����̷�Ʈ ����̿�)