package step01;

public class Parent extends Object{	//�ص� ���ص� �Ȱ���. �ڵ����� �������
	String name;
	int age;
	
	public Parent() {
		super();	//Object()->Object ��ü�� ����. ������ �����Ϸ��� �ڵ����� �߰�����. 
		System.out.println("�θ��� �⺻ ������");
	}	//name, age ���� ������ ��� �����ϰ� heap ��ü ���ο� ����
		// Parent ��ü ���� �Ϸ�
	
	public Parent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("�θ��� ������");
	}
	public void printAll() {
		System.out.println(name);
		System.out.println(age);
	}
	
	@Override	//�θ𿡰� ��ӹ޾����� ������ �����ϴ� ��
	public String toString() {
		return "Parent [name=" + name + ", age=" + age + "]";
	}
	
	
}
