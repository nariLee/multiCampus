package step01;

public class Parent extends Object{	//해도 안해도 똑같음. 자동으로 만들어짐
	String name;
	int age;
	
	public Parent() {
		super();	//Object()->Object 객체가 생성. 지워도 컴파일러가 자동으로 추가해줌. 
		System.out.println("부모의 기본 생성자");
	}	//name, age 변수 공간이 사용 가능하게 heap 객체 내부에 생성
		// Parent 객체 생성 완료
	
	public Parent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("부모의 생성자");
	}
	public void printAll() {
		System.out.println(name);
		System.out.println(age);
	}
	
	@Override	//부모에게 상속받았지만 내용은 수정하는 것
	public String toString() {
		return "Parent [name=" + name + ", age=" + age + "]";
	}
	
	
}
