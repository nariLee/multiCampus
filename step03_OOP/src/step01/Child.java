package step01;

public class Child extends Parent{

	String job;
	public Child() {
		super("창윤",28);	//Parent()실행. 지워도 컴파일러가 자동으로 추가해줌. 
						//Object -> Parent(name, age) -> Child(job)
						//super()를 Parent()로하면 에러가 뜸.
		System.out.println("자식의 기본 생성자");
	}
	
	//재정의
	public void printAll() {
		super.printAll();
		System.out.println(job);	//부모의 메소드를 불러와서 추가하는 것.
	}
	
	
	public static void main(String[] args) {
		//step01 - 상속 관계의 객체 생성 학습
		Child c = new Child();	//생성한 것은 Child만 했는데 부모의 기본생성자도 실행됨.
		//Parent c = new Child();	
		//Child c2 = (Child)c;  // ---> downCasting 형변환
		System.out.println(c.name);
		c.name = "상만";
		System.out.println(c.name);
		//c.job = "IT man";
		System.out.println("---");
		c.printAll();
		
		int i = 20;
		byte b = (byte)i;
		 
		//c2.job = "ITman";
		//System.out.println(c2.job);
		
		
		//step02 - 다형성
		/*Parent p = new Child();	//자식 레벨이 부모 레벨로 upcasting 형변환
		p.name = "윤길";
		//p.job = "IT";	//문법오류
		//자식만의 멤버에 access를 위한 필수 문법 - 객체간의 형변환
		Child c2 = (Child)p;	//부모레벨을 자식레벨로 downcasting 형변환
		c2.job = "IT man";
		c2.printAll();*/
		
		
		
	}

}
