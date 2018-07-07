/* test 데이터 표현, DTO 객체들 저장, 수정, 삭제, 검색(모든 검색, id로 검색..)의 핵심 로직을 보유
 * 1. 각 기능은 개별 메소드로 구현
 * 2. 개별 메소드에서 하나의 데이터를 공유
 * 3. 데이터를 배열 활용: DTO 객체를 CRUD
 * 
 */
package customer.model;

import customer.domain.CustomerDTO;

public class CustomerModel {
	//5개의 메모리가 있는 배열 생성(index 0~4, length 변수)
	static CustomerDTO[] all = new CustomerDTO[5];
	//byte code가 메모리에 로딩 시 무조건 자동 실행되는 블록
	//임시 test 데이터 초기화에 적합
	static {
		all[0] = new CustomerDTO("tester","이상록","11",26,"vip");
		all[1] = new CustomerDTO("admin","박창윤","22",28,"vvip");
		all[2] = new CustomerDTO("master","김경남","33",28,"vvip");
		all[3] = new CustomerDTO("ldh","이동훈","55",27,"vip");
	}
	
	//조건없이 모든 검색
	public static CustomerDTO[] getAll() {
		return all;
	}
	
	//id값으로 해당 고객의 모든 정보 반환
	/* 1. parameter - String id
	 * 2. 반환타입 - CustomerDTO 
	 * 
	 * 값 비교시 필요한 API - equals()
	 * 비교 - 조건식
	 * 배열에는 여러개의 DTO 객체들 - 반복
	 * 
	 * 데이터가 존재하면 해당DTO 객체 반환
	 * 해당 데이터가 미존재시 null값 반환
	 * */
	public static CustomerDTO getOne(String id) {
		CustomerDTO dto = null;
		for(int i=0; i<all.length; i++) {
			dto = all[i];
			if(dto != null && (dto.getId().equals(id))) {	//dto!=null을 안하면 5번째 데이터가 없으므로 null포인터 에러가 뜸
				break;	//반복문 종료하는 제어문
			} else {
				dto = null;
			}
		}
		return dto;
	}
	
	//가입
	/* [1]구현 관점에만
	 * 1. 경우의 수 1 - 마지막 배열 영역에 단순 저장(all[4] = DTO객체변수)
	 * 2. 경우의 수 2 - null일 수도 있는 즉 delete로 삭제한 메모리 영역이 있다면 해당 index에 저장
	 * 
	 * 
	 * [2] 호출 관점
	 * 1. null이 존재할 경우 해당 위치에 새로운 CustomerDTO 저장
	 * 2. null이 없음...?의 경우 호출한 곳에서는 상황 판단이? 어.렵.다
	 * */
	public static int addOne(CustomerDTO one) {
		int index = all.length;
		
		for(int i=0; i<all.length; i++) {
			if(all[i] == null) {
				all[i] = one;
				index = i;	//5인 index 변숙밧을 저장시킨 배열의 index 값으로 대입
				break;
			}
		}
		
		return index;	//5 또는 저장된 배열의 index 값이 변환.
	}
	
	
	//삭제
	/*id로 해당 고객 삭제하기 (배열의 해당 index에 null 대입)
	 * 1. 필요한 데이터: id
	 * 2. 반환 타입: boolean
	 */
	public static boolean deleteOne(String id) {
		
		for(int i=0; i<all.length; i++) {
			if(all[i] != null && all[i].getId().equals(id)) {
				all[i] = null;
				return true;
			}
		}
		return false;
	}
	
	//수정
	public static boolean updateOne(String id, String grade) {
		
		for(int i=0; i<all.length; i++) {
			if(all[i] != null && all[i].getId().equals(id)) {
				all[i].setGrade(grade);
				return true;
			}
		}
		return false;
	}
	
	/*public static void main(String[] args) {
		//System.out.println(getOne("tester2"));
		addOne(new CustomerDTO("ㅇㅇㅇ","ㅇㅇㅇ","1",24,"vip"));
	}*/
}
