package step01;

public class EqualsTest {
	
	public static void main(String[] args) {
		PeopleDTO p1 = new PeopleDTO("����", 26);
		PeopleDTO p2 = new PeopleDTO("����", 26);
		PeopleDTO p3 = new PeopleDTO("���ƿ�", 24);
		
		System.out.println(p1.equals(p2));	//true
		System.out.println(p1.equals(p3));		//false
	}

}
