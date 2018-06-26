package step01.service;
import step01.domain.FriendVO;

public class FriendTest {
	//java program의 start point 필수 메소드
	
	public static void main(String[] args) {
		FriendVO p1 = new FriendVO();
		System.out.println(p1);	//p1의 주소가 출력됨.
		System.out.println(p1.name+" "+p1.cellPhone+" "+p1.age);
			
		FriendVO p2 = new FriendVO();
		p2.name = "한권열";
		p2.age = 27;
		p2.cellPhone = "000-0000-0000";
		System.out.println(p2.name+" "+p2.cellPhone+" "+p2.age);
		
		FriendVO p3 = new FriendVO();
		p3.name = "황혜연";
		p3.age = 25;
		p3.cellPhone = "000-0000-0000";
		System.out.println(p3.name+" "+p3.cellPhone+" "+p3.age);
		
		FriendVO p4 = new FriendVO("이나리","000-0000-0000",25);
		System.out.println(p4.name+" "+p4.cellPhone+" "+p4.age);
	}	
}
