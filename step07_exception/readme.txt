학습내용

1. 서비스 중에 발생 가능한 경우의 수를 개발 시점에 처리하는 기술
2. 용어
	1) 예외
		- exception
			- 컴파일 exception
			- try~catch 처리 필수
				ClassNotFoundException
				...
			- 실행 exception
			- try~catch 옵션(필수X)
				RuntimeException이 원조, 모든 하위 클래스들은 실행시 예외 발생
				NullPointerException
				ArithemeticException
				...
		- 비정상 실행 중 처리 가능한(발생 가능한) 경우의 수
	2) 에러 - 시스템 다운, 전원 차단, 복구 불가능한 상황

3. 서비스의 만족도가 좋은 프로그램들의 우선 순위
	1) 사용성 평가
	2) 안정적
		- 예외 처리가 잘 되어 있음

4. 실습단계
	1) System.out.println(10/0);
		(1) 컴파일: 성공
		(2) 실행: 	예외 발생
		(3) 처리
			 방법1: 10/2로 변경
			 방법2: try~catch로 처리
	2) Class.forName("step01.A");
		(1) 컴파일: 실패(값이 정확함에도 불구하고...)
		(2) 실행: 컴파일 자체가 안되었으니 실행 불가
		(3) 처리
			방법: try~catch로 처리
