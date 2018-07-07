package step01;

public class InstanceofTest {

	public static void main(String[] args) {
		//equals()는 객체끼리의 주소값을 비교하는 것.
		//String과 Integer 객체끼리를 비교할 경우 객체의 주소값을 비교하는 것이 아니라, 데이터값을 비교하는 것으로 
		//자바가 정의해 놓았음.
		//String 객체의 내용값 비교
		System.out.println("data".equals("data"));	//true
		
		//Integer 객체의 내용값 비교
		Integer i = new Integer("3");
		Integer i2 = new Integer("33");
		System.out.println(i.equals(i2));	//false
		
		//서로 다른 타입이긴 하나 equals()의 parameter가 Object
		/*java.lang.Object는 모든 객체 타입의 최상위
		 * 기본 타입 8가지를 제외한 모든 타입 다 수용가능*/
		System.out.println(i.equals("문자열"));		//타입이 달라서 false
		
		//1
		System.out.println(i.equals("3"));	//타입이 달라서 false
		//2
		System.out.println("3".equals(i));	//타입이 달라서 false		---> 내용물보다는 타입을 먼저 비교하고 타입이 다르면 false
		
		
		//사용자 정의 객체의 내용값 비교
		
		
		//Object의 자식 String, Integer,...
		/*객체 타입 비교 연산자
		 * 1. 비교변수(값) instanceof 타입
		 * 2. 제약조건 : 상속관계에서만 비교 가능
		 * 
		 * */
		System.out.println("string"instanceof Object);	//true
		System.out.println("string" instanceof String);	//true
		
		//String과 Integer은 상속 관계가 아님. 따라서 비교 불가
		//System.out.println("string" instanceof Integer);		//문법오류
		
		
		System.out.println("재정의----");
		AA a = new AA();
		AA a2 = new AA();
		System.out.println(a.equals(a2));	//false. --> 타입은 같지만 주소값이 달라서 다른 객체로 인식
														//재정의 후에는 true
		
	}

}

class AA extends Object{
	int data;
	
	AA(){}
	AA(int d){
		this.data = d;
	}
	//객체의 주소값 비교했던 메소드를 내용값(변수값) 비교로 재정의
	/*AA 객체들 비교
	 * 1. AA 타입여부 비교 (타입비교를 먼저해야함) - instanceof 연산자 이용
	 * 2. AA 타입이 일치된다면 AA객체들이 보유한 멤버변수값 비교
	 * 		Object 타입의 변수는 상속시킨 메소드만 호출
	 * 		자식만의 멤버를 호출하기 위해서는 형변환 필수
	 * */
	
	public boolean equals(Object o) {
		if(o instanceof AA) {	//1번.
			AA a = (AA)o;	//data 멤버 변수 비교를 위한 형변환
			if(data == a.data) {	//2번.
				return true;
			}
		}
		return false;
	}
}
