�н� ����

1. DB�ý����� ���� �����ڼ� �����ϴ� ���
2. �ʿ��� �ǽ� ȯ��
	1) RDBS
		- oracle
			: customer table - id/pw/name
	2) Java ����ȯ��
	3) Server
	
3. ���� ������ �ο� ����
	1) context.xml
     (1) ������ �ڿ��� ��Ī
     	 �������� ���� mySQL, MSSQL�� ���� db�� �����Ҽ��� ����.  
     	 Resource name="jdbc/myoracle" 
     (2) auth="Container": �� �ڿ� �����ڴ� Container
     (3) �ڹ� �ҽ��� �� ������ �߰� �Ŵ���
     	 �ҽ����� DataSource�� �޾Ƽ� Connection�� �����ްԵ�
     	 type="javax.sql.DataSource"
     (4) �����ϰ��� �ϴ� DB�� driver��
     	 driverClassName="oracle.jdbc.OracleDriver"
     (5) �����ϴ� DB�� url��
     	  url="jdbc:oracle:thin:@127.0.0.1:1521:xe"
     (6) ID
     	  username="SCOTT"
     (7) PW
     	  password="TIGER"
     (8) ���� ������ ��(Connection �ִ� ����)
      	 maxTotal="20" 
     (9) �����ڰ� �����ϴ��� �����ؼ� ����ϴ� ���� ����
      	 maxIdle="10"
     (10) 20���� ���Ǵ� ������ �ʰ��Ǵ� �ο��� ������ ���Ҷ� ����ϴ� �ð��� ���Ѵ�...
     		-> ����� client�� �˾Ƽ� �������ϰ���..
       	 maxWaitMillis="-1"