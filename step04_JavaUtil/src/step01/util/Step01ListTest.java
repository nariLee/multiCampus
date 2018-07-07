/*학습 내용
 * 1. 주요 API
 * 		1) java.util
 * 		2) ArrayList - 동적 배열과 흡사
 * 			- 첫 생성시 10개의 메모리 생성
 * 			- 11번째 데이터 넣으면 10개가 추가 생성
 * 		3) 메소드
 * 			(1) 데이터 저장: add(Object o)
 * 			(2) 데이터 삭제: remove(int index)
 * 			(3) 데이터 반환: get(int index)
 * 			(4) 데이터 개수: size()
 */
package step01.util;

import java.util.ArrayList;	//java.lang패키지를 제외한 모든 패키지는 import해야함.

public class Step01ListTest {

	public static void main(String[] args) {
		System.out.println("--- 제네릭 미 반영 ---");	//제네릭을 안쓰면 Object타입 객체
		ArrayList a = new ArrayList();
		a.add(3);	//new Integer(3)
		a.add("ans");	//? ans에서 index 1번째의 문자열 객체만이 보유한 charAt(1)
											//이때 ans와 3은 Object 객체임.
		String v = (String)a.get(1);	
		System.out.println(v.charAt(1));
		
		System.out.println(((String)a.get(1)).charAt(1));	//위의 두줄을 한줄로 줄인 것
		
		
		System.out.println("--- 제네릭 적용한 list jdk1.5부터 제시---");
		//String들만 저장 가능함. 동적 메모리의 배열 형태 객체 생성
		//타입 제약 - 제네릭
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(list.size());		//0

		//데이터 저장
		list.add("이나리");	//0번째 자동 저장
		
		//제네릭 구조는 형변환 없이 index 값으로
		//실제 생성된 타입의 객체로 반환
		System.out.println(list.get(0).charAt(2));	//리 출력. 위와는 다르게 String객체이기 때문에 형변환이 필요없음
		list.add("한권열");
		list.add("김혜연");
		list.add("김혜연");
		//list.add(new Integer(3));	//문법 오류 왜? String타입으로 지정해놨기 때문에 String만 저장 가능 
		System.out.println(list.size());	//4
		
		//index로 1에 저장된 데이터 반환 및 출력
		System.out.println(list.get(1));	//한권열
		
		//데이터 삭제
		list.remove(1);
		System.out.println(list.size());	//3
		System.out.println(list.get(1));	//김혜연
		
		System.out.println(list);	//이나리, 김혜연, 김혜연 모두 출력
	}

}
