package step01;

public class ExceptionTest {

	public static void main(String[] args) {
		
		System.out.println(1);
		try {
			System.out.println(10/0);	
		}catch(ArithmeticException e) {
			e.printStackTrace(); 	//예외발생 상세 정보를 콘솔창에 출력
		}
		
		System.out.println(2);	//2가 출력되지 않음
		
		//byte code를 메모리에 로딩하는 기능의 API
		/*forName() 메소드 개발자 관점
		 * 1. parameter 클래스를 메모리에 로딩
		 * 2. 이 로직 실행 발생 가능한 경우의수
		 * 		1) 정상: 로딩(저장) 성공
		 * 		2) 비정상: 비정상 상황을 이 메소드 호출한 곳에 알려줌
		 * 3. 경우의 수 모두다 적용한 처리 기수
		 * 		1) 이 메소드를 사용할 경우 무조건 발생 가능한 불안정 할수도 있는 상황을 처리하겠음 지시
		 *  
		 * 
		 */
		
		/*try {
			Class.forName("step01.A");	//패키지명.클래스명
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}*/
		
		
		
	}
	
}

class A{
	static {
		System.out.println("A의 byte code가 로딩되었습니다.");
	}
}
