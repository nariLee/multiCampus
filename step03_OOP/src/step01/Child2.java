/*?1. Parent2 상속 받기
 * 2. int no2 선언 및 초기화(값 대입)
 * 3. printAll() 재정의
 * 4. 다형성이 적용된 객체를 main에서 생성
 * 5. printAll() 호출
 * 6. Child2만의 no2 값을 100으로 수정
 * 7. no2 값만 출력
 * */

package step01;

public class Child2 extends Parent2{
	int no2 = 0;
	void printAll() {
		System.out.println(no2);
	}
	public static void main(String[] args) {
		Parent2 p = new Child2();
		Child2 c = (Child2)p;	//p와 c는 같은 주소값
		c.no2 = 100;
		p.printAll();		//100
		System.out.println(p.no1);	//10
		p.no1 = 1000;
		System.out.println(c.no1);//1000
	}

}


class Parent2 {
	int no1 = 10;
	void printAll() {
		System.out.println(no1);
	}
}