�н� ����

1. sql + ���α׷� ����
2. ��� ���� DB����
	Oracle, java[JDBC API]
3. JDBC API
	1) Java Database Connectivity ǥ�� API
	2) db ������ �����ϰ� ������ �ڵ�� ����
4. ����
	Oracle : DB2 : MS Sql : My Sql : Maria : ť�긮��
	�� DB�� ������ ���� �޼ҵ�
		Connection getConnection(String uri, String pw)
	�ڹ� ���� DB�� �����ϰ��� �Ҷ��� �ش� �޼ҵ常 ȣ��
		Connection con = getConnection("ip", "SCOTT", "TIGER");
		
	1) ������ ���� �޼ҵ�� �ݵ�� ������ ���ƾ� �� (rule=����)
		- ��ɹ� + �̿ϼ� �޼ҵ� ���𱸸� ���� - Interface
		Connection getConnection(String uri, String id, String pw);
		- (��)Sun mycrosystems���� ����
		
	2) DB ������� ���忡 �°� ����
		Connection getConnection(String uri, String id, String pw){
			�� �����翡 �°� ���� �Ϻ��� ����
			DB���� ����� ��ü �����ؼ� ��ȯ
		}
		
	3) DB�� ����ϴ� �ڹ� ������
		- Connection con = getConnection("ip", "SCOTT", "TIGER");
		
5. sqlplus�� DB�� �����ϴ� �۾� �ܰ�
	1�ܰ� - db ������..
	2�ܰ� - sqlplus ����
	3�ܰ� - db ���� > sqlplus id/pw ����
	4�ܰ� - ���� �Ϸ�
	5�ܰ� - sql���� �ۼ� ����
	6�ܰ� - ����� output
	7�ܰ� - ��� Ȱ��
	8�ܰ� - exit ���� ����
	
6. sqlplus�� DB�� �����ϴ� �۾� �ܰ� & java API(JDBC)�� ����
	1�ܰ� - db ������..
	2�ܰ� - �ڹ� �ڵ� ����
	3�ܰ� - db ���� : Connection ��ü ���� ��û(uri, id, pw)
	4�ܰ� - ���� �Ϸ� : Connection ��ü ���� �Ϸ� - DB���� �Ϸ�
	5�ܰ� - sql���� �ۼ� ����sql ���� ����
			Statement ��ü ���� - sql ���� �����ϴ� �ڹ� ��ü
			sql���� ���� �޼ҵ� ����
			  select - �������(ResultSet)
			  	ResultSet executeQuery("Select�� ���� �޼ҵ�")
			  	
			  insert/update/delete[DML] - DB table�� ������ ��ģ ���
			  	int executeUpdate("dml"){}
			  	
	6�ܰ� - ����� output
			ResultSet
				��� row ���� ���� Ȯ�� ����
					boolean next()
				�ش� row�� Ư�� �÷��� ��ȯ ���
					int getInt()
					double getDouble()
					String getString("�÷���" or "�˻����÷�����")
					...
				
					number(8)	����
					number(2,1)	�Ǽ�
					char(10)
					varchar2(10)
	7�ܰ� - ��� Ȱ��
	8�ܰ� - exit ���� ����
		close()
		
7. DB���� ���α׷� ���߽� �������
	1) DB �ý����� Ȥ�� �ٿ�?
	2) DB�� ip�� ����?
	3) DB�� table�� ���� ����?
	4) sql���� ����?
	-- SQLException ���� ����� �� ó�� �ʼ��� ����
	...
	*JDBC API - java.sql packages
	
8. review[Design Pattern]
	1) DataTransfer Object(Value Object, Java Bean)
		- DTO/VO
	2) MVC
		- Model
		- View
		- Controller
	3) SingleTon pattern
	4) Data Access Object(DAO)
		- DB�� ���� ������ �ϴ� class
		- sql���� + JDBC api�θ� ����
		- DAO Ŭ�������� ���������� ����ϴ� Ŭ���� �� �и�