/*학습내용
 * 1. java.util.Set ApI 학습
 * 2. Set 특징
 * 		1) 중복 데이터 불허(고유한 데이터만 저장)
 * 		2) 저장은 쉬움. 단, 데이터 하나하나 반환할 경우 Iterator API 활용
 * 		3) 데이터 저장 순서에 대한 관리는 개발자가 불가 
 * 
 */
package step01.util;

import java.util.HashSet;
import java.util.Iterator;

public class Step02SetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		
		set.add("aㅁㄴㅇㄹ");
		set.add("ㅁㄴㅇㄹa");	//중복데이터 불허
		set.add("ㅁㄴㅇㄹa");
		set.add("ㄴㅇㅁd");
		set.add("cㅁㄴㅇㄹㄴ");	//순서를 바꿔서 저장해도 순서에대한 보장은 절대하지않음

		System.out.println(set.toString());
		
		/*Set 내부에 있는 데이터들을 하나하나씩 반환받아 사용하기
		 * 1. Iterator
		 * 		- 모든 데이터들을 정해진 순번없이 열거해서 하나씩 사용가능하게 해주는 API
		 * 		- 데이터 존재 확인 기능 - hasNext()
		 * 		- 존재할 경우 반환하는 기능 - next()
		 * 2. 개발 로직을 말로 해보기 (의사코드)
		 * 		1단계 - HashSet 객체의 데이터들을 Iterator로 변환
		 * 		2단계 - Iterator에서 데이터 존재 여부 확인
		 * 				 : 반복문 필요
		 * 					for?(반복횟수 명확할때) while? do~while?(무조건 1번이상 실행할때) ---> while
		 * 		3단계 - 존재할 경우 
		 * 					데이터 반환
		 * 			   - 미존재할 경우
		 * 					종료
		 * 
		 */
		Iterator all = set.iterator();
		String data = null;
		while(all.hasNext()) {
			data = (String) all.next();
			System.out.println(data);
			//System.out.println(all.next());	//set에 있는 데이터를 하나씩 출력
		}
		
		System.out.println("-----------");
		//제네릭 반영 후 형변환없이 객체들(element) 활용
		Iterator<String> all2 = set.iterator();	//Iterator도 제네릭을 사용할 수 있다.
		String data2 = null;
		while(all2.hasNext()) {
			data2 = all2.next();
			System.out.println(data2);
			
		}
	}

}
