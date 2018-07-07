/*Wrapper class들 학습
 * 1. 필요성
 * 		- 예시: 객체만 저장 가능한 배열, 객체만 저장 가능한 자료 구조 사용시 기본 타입값은 순수하게 저장 및 관리 불가
 * 		- 해결책: 기본 타입을 보유한 각 타입별 서포트 클래스들 제시
 * 					java.lang에 8가지로 제시
 * 2. 종류
 * 		byte - 2           :              Byte - new Byte(2)
 * 		short - 3          :              Short - new Short(3) 
 * 		int: Integer
 * 		long: Long
 * 	
 * 3. 	객체 타입과 기본 타입간의 호환 문법: jdk1.5 부터 추가
 * 		구버전: Integer i = new Integer(3)
 * 				 int i = 3;
 * 		신버전: - Integer i = 2;       --------> autoboxing
 * 				    컴파일 직후 Integer i = new Integer(2);으로 변환
 * 			     - int i = new Integer(2);				---------> unboxing
 * 				    컴파일 직후 int i = (new Integer(2)).intValue();
 */

package step04.API;

public class Step02Wrapper {

	public static void main(String[] args) {
		String s = "3";
		System.out.println(s.equals(3));	//false
		System.out.println(s.equals(new Integer(3)));	//false	//위의 코드가 내부적으로 실제 실행됨.
	}

}
