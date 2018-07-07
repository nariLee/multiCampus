package customer.view;

import customer.domain.CustomerDTO;

public class EndView {
	//모든 고객 정보 출력
	public static void printAll(CustomerDTO[] all) {
		for(int i=0; i<all.length; i++) {
			if(all[i] != null) {
				System.out.println(all[i].toString());
			}
		}
	}
	
	
	//데이터가 null인 경우 단순 메시지 출력
	public static void printOne(CustomerDTO one) {	//해당 아이디가 있을때
		System.out.println(one.toString());
	}


	public static void printMsg() {	//해당 아이디가 없을때
		System.out.println("요청하신 정보가 미 존재합니다.");
	}


	public static void printMsg(String msg) {
		System.out.println(msg);
	}
	
	//데이터가 CustomerDTO인 경우 해당 데이터 내용 출력
}
