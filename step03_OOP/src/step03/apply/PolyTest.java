//다형성 익숙해지기
package step03.apply;

public class PolyTest extends Object{	//자동추가된 코드

	public PolyTest() {
		super();
	}
	
	//문자열 객체 생성후 Object(최상위) 타입으로 반환
	//Object 변수 = "문자열"; 와 상동 (upcasting)
	public static Object getData() {
		
		return "문자열";	//String 객체 생성 -> 반환
	}
	public static void main(String[] args) {
		
		PolyTest p = new PolyTest();
		System.out.println(p);
		System.out.println(p.toString());	//p와 p.toString()값이 같음. toString()메소드가 주소값을 반환하도록 정의되어있음.
		
		String data = (String)getData();	//downcasting 형변환
		System.out.println(data.charAt(0));	//charAt()은 String이 가진 메소드
		
		Integer i = new Integer(33);
		System.out.println(i);
		System.out.println(i.toString());	//둘다 33이 나옴. 
		
		//실행순서: getData() -> getData().charAt(0) -> (String)
		//System.out.println((String)getData().charAt(0));	
		System.out.println(((String)getData()).charAt(0));	
	}

}
