package util;

public class InstanceTest {

	
	public static void main(String[] args) {
		D d = new D();
		//�� �̻��� ��ü���� ���� ���� no ������ ����ϴ� ������?
		System.out.println(d.c.b.a.no);
	}

}

class A{
	int no = 20;
	A(){
		//super();
		System.out.println("A");
	}
	
	
}
class B{
	B(){
		//super();
		System.out.println("B");
	}
	A a = new A();
	
	
}
class C{
	C(){
		//super();
		System.out.println("C");
	}
	B b = new B();
	
}
class D{
	
	D(){
		//super();
		System.out.println("D");
	}
	C c = new C();
	
	
	
}