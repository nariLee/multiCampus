package util;

public class InstanceTest {

	
	public static void main(String[] args) {
		D d = new D();
		//더 이상의 객체생성 문법 없이 no 변수값 출력하는 문법은?
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