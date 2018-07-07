/*Data Transfer Object = Value Object = Java Bean
 * 1. 명명규칙
 *     - 도메인DTO.java / 도메인VO.java / 도메인Bean.java /도메인    --> 회사마다 다름.
 * 2. 구조
 *     - 멤버 변수: private
 *     - 멤버 메소드: 변수 즉 데이터가 반환, 데이터값 수정 로직으로만 구성
 *     					 데이터 수정 메소드에는 값의 유효성 검증 구현
 *     - 생성자: 기본 생성자, 멤버 변수들 초기화 생성자
 *     - toString: 멤버 변수들 값 결합해서 반환하는 메소드
 * */

package step01;

public class PeopleDTO {	//DTO와 VO 같음
	private String name;		//heap
	private int age;		//heap
	
	public PeopleDTO() {}
	public PeopleDTO(String newName, int newAge) {
		name = newName;
		age = newAge;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/*@Override
	 * - 주석보다 더 강한 명시적인 명령어
	 * - 해당 스펙에 맞게 구현을 안 하면 문법 오류가 발생
	 * @명령어
	 * 		-@override: 이 메소드는 반드시 재정의 하세요 라는 명령
	 * @: 엣
	 */
	@Override	//toString(int i)식으로 하면 @override명령어때문에 오류가 뜸.
	/*public String toString() {
		return "PeopleDTO [name=" + name + ", age=" + age + "]";
	}*/
	
	public boolean equals(Object o) {//Object o = p2;
		
			if(o instanceof PeopleDTO) {
				PeopleDTO p2 = (PeopleDTO)o;
				if(name == p2.name && age == p2.age) {
					return true;
				}
			}
			return false;
		}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PeopleDTO [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}	
	
}
