/*학습내용
 * 1. 객체 간에 멤버로 사용(포함)되는 관계를 "has a"관계
 * 2. 발음
 * 		has a [해즈어, 해저]
 * 3. 참고
 * 		- 상속은 is a[이즈어, 이저] 로 표현
 * 		- 즉 속성(데이터)들이 동일한 경우에만 상속 권장
 * 		예시: 직원 클래스와 고객 클래스 간에는 상속 비추
 * 
 * */

package step02.hasa;

public class HasATest {
	static void printAll(Person p) {
		System.out.println("엔진이름: "+p.myCar.engine.getEngineName());
		System.out.println("cc: "+p.myCar.engine.getCc());
		System.out.println("person: "+p.getName());
		System.out.println("----------------------------------");
	}
	
	static void setAll(Person p) {
		p.myCar.engine.setEngineName("new엔진이름");
		p.myCar.engine.setCc(1000);
		p.setName("이나리2");
	}
	public static void main(String[] args) {
		//String -> Engine -> Car -> Person & String
		/*두사람의 즉 개별 Person 객체 생성
		 * 엔진이름, cc, Person의 이름을 다 수정하시고
		 * 출력
		 */
		Person p1 = new Person();
		Person p2 = new Person();
		
		
		printAll(p1);
		setAll(p2);
		printAll(p2);
		
	}

}
