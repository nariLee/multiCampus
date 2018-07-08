package step01;

public class ExceptionTest3 {
	//id값의 검증 - tester
	//if조건식으로
	static void idCheck1(String id) {
		if("tester".equals(id)) {
			System.out.println("회원");
		}else {
			System.out.println("비회원");
		}
	}
	
	
	//exception 처리
	//상황에 맞게 개발자가 직접 예외를 발생 -> 처리
	static void idCheck2(String id) throws Exception{	//throws Exception을 주어야 함
		if(!"tester".equals(id)) {
			throw new Exception("비회원");	//문제가 발생하면 21번줄은 실행이 되지 않음
		}
		System.out.println("회원");
	}
	
	
	public static void main(String[] args) {
		idCheck1("tester");
		
		try {
			idCheck2("test");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
