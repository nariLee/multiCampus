package step01;

public class Child extends Parent{

	String job;
	public Child() {
		super("â��",28);	//Parent()����. ������ �����Ϸ��� �ڵ����� �߰�����. 
						//Object -> Parent(name, age) -> Child(job)
						//super()�� Parent()���ϸ� ������ ��.
		System.out.println("�ڽ��� �⺻ ������");
	}
	
	//������
	public void printAll() {
		super.printAll();
		System.out.println(job);	//�θ��� �޼ҵ带 �ҷ��ͼ� �߰��ϴ� ��.
	}
	
	
	public static void main(String[] args) {
		//step01 - ��� ������ ��ü ���� �н�
		Child c = new Child();	//������ ���� Child�� �ߴµ� �θ��� �⺻�����ڵ� �����.
		//Parent c = new Child();	
		//Child c2 = (Child)c;  // ---> downCasting ����ȯ
		System.out.println(c.name);
		c.name = "��";
		System.out.println(c.name);
		//c.job = "IT man";
		System.out.println("---");
		c.printAll();
		
		int i = 20;
		byte b = (byte)i;
		 
		//c2.job = "ITman";
		//System.out.println(c2.job);
		
		
		//step02 - ������
		/*Parent p = new Child();	//�ڽ� ������ �θ� ������ upcasting ����ȯ
		p.name = "����";
		//p.job = "IT";	//��������
		//�ڽĸ��� ����� access�� ���� �ʼ� ���� - ��ü���� ����ȯ
		Child c2 = (Child)p;	//�θ𷹺��� �ڽķ����� downcasting ����ȯ
		c2.job = "IT man";
		c2.printAll();*/
		
		
		
	}

}
