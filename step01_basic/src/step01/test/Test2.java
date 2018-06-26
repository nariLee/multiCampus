/*학습내용
 * 1. 변수의 타입
 * 		타입 변수명;
 * 2. 메소드의 타입
 * 		반환타입, argument에 선언하는 변수 타입
 * 		반환타입 메소드명( [타입 변수명,...] ){}
 * 3. 타입으로 사용 가능한 타입의 수는?
 * 		1) int와 같은 기본 타입 - 총 8가지
 * 		2) String처럼 JDK 내부에 class로 제공해주는 타입
 * 		3) 사용자가 직접 개발하는 클래스
 * */

package step01.test;
import step01.domain.FriendVO;
import step01.syntax.step01Method;

public class Test2 {
	
	void m1(String v) {}
	
	//String을 반환하는 메소드 구현
	String m2() {
		return "ee";
	}
	
	void m3(FriendVO v) {}
	
	//FieldVO
	public static void main(String[] args) {
		Test2 t = new Test2();
		System.out.println(t.m2());
		t.m1("문");
		t.m3(new FriendVO());
	}

}
