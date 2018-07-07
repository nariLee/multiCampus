package customer.view;

import customer.controller.CustomerController;
import customer.domain.CustomerDTO;

public class StartView {

	public static void main(String[] args) {
		//모든 검색 - null인 경우 절대 출력 불가
		System.out.println("*****모두 검색*****");
		 CustomerController.all();
		 
		 
		//검색 - id로 검색
		 System.out.println("*****id로 검색*****");
		CustomerController.getOne("tester");
		CustomerController.getOne("tester2");
		
		
		//가입 - id가 중복되면 가입 불가
		System.out.println("*****가입*****");
		CustomerDTO newOne = new CustomerDTO("man","허윤길","77",26,"vip");
		CustomerController.addOne(newOne);
		CustomerController.all();
		
		
		System.out.println("*****삭제*****");
		//삭제 - 존재하는 데이터 삭제, 미존재하는 데이터 삭제시도?
		CustomerController.deleteOne("tester");
		CustomerController.deleteOne("tester");
		CustomerController.all();
		
		
		//수정 - 존재하는 데이터 수정, 미존재하는 데이터 수정시도?
		/*id로 등급을 수정
		 * 단, 정상 수정? 비정상 수정 수정여부에 대한 상황은 반드시 구분
		 * */
		System.out.println("*****수정*****");
		CustomerController.updateOne("master", "vvvip");
		CustomerController.all();
		
	
	}

}
