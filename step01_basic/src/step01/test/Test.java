package step01.test;

public class Test {
	
	String message;	//����
	int age;	//����
	public Test() {}	//������
	public Test(String m, int a) {
		message = m;
		age = a;
		
	}
	
	public static void main(String[] args) {
		//��ü ���� ���� ��������� ����� �� ����.
		Test t1 = new Test("������ �� ���׿�", 46);
		System.out.println(t1.message+" "+t1.age);
		
	}

}

/*
 * 1. ������ ���� �ڵ� �߰��Ǵ� �ڵ��?	public Test(){} 
 * 2. ������ �� ���׿�..��� �����͸� ������ �� �ִ� ������ ����	String message;
 * 3. 46�̶�� ���� ���尡���� ���� ����	int age
 * 4. ��ü ���� ������ �������� �����ͷ� ������ ������ �� �ִ� parameter(argument, �Ű�����)�� �ִ� ������
 * 		public Test(String m, int a)
 * 5. "������ �� ���׿�", 46�̶�� �����ͷ� ��ü ���� �� ������ ����ϱ�
 */