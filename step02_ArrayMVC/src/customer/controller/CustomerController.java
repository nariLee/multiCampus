package customer.controller;

import customer.domain.CustomerDTO;
import customer.model.CustomerModel;
import customer.view.EndView;

public class CustomerController {
	//모든 검색
	public static void all() {
		EndView.printAll(CustomerModel.getAll());
		/*CustomerDTO[] all = CustomerModel.getAll();
		EndView.printAll(all);*/
	}
	//id로 해당 고객 정보만 검색
	/*Model의 getOne()의 반환값
	 * - CustomerDTO or null
	 * - EndView에게 출력을 위임할 때 이 두가지 데이터를 어떻게 출력 요청?
	 * 개발 방법의 경우의 수
	 * 1) 경우의 수1
	 *     - EndView의 메소드에 무조건 출력 위임
	 *       : EndView는 null 여부 검증
	 * 2) 경우의 수2 (현업에선 이거 사용)
	 * 		- Controller에서 null 검증
	 * 		- null인 경우 다른 출력 메소드 호출, null이 아닌 경우 또다른 메소드 호출
	 */
	public static void getOne(String id) {
		CustomerDTO one = CustomerModel.getOne(id);
		if(one != null) {	//검색은 데이터가 존재할 경우 true
			EndView.printOne(one);
		} else {
			EndView.printMsg();
		}
	}
	
	
	
	//grade로 해당 등급들만 검색
	
	//가입
	public static void addOne(CustomerDTO newDTO) {
		int result = CustomerModel.addOne(newDTO);
		if(result != 5) {
			EndView.printMsg("회원가입 완료");
		}else {
			EndView.printMsg("죄송합니다. 고객님 영역 점유는 불가입니다.");
		}
	}
	
	//수정 - id를 기준으로 grade 수정
	
	//삭제 - id
	public static void deleteOne(String id) {
		boolean result = CustomerModel.deleteOne(id);
		if(result) {
			EndView.printMsg(id+" 회원님 삭제 성공");
		}else {
			EndView.printMsg("삭제 실패");
		}
	}
	
	//수정 - grade
	public static void updateOne(String id, String grade) {
		boolean result = CustomerModel.updateOne(id, grade);
		if(result) {
			EndView.printMsg(id+" 회원님 등급 "+grade +"로 수정 성공");
		} else {
			EndView.printMsg("수정 실패");
		}
	}
}
