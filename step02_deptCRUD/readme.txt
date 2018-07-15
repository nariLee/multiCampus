학습내용

1. DAO[Data Access Object] pattern 학습
	- sql + jdbc api
	- DeptDAO.java
	- 각 기능별 메소드 구분해서 세분화
		- 메소드 sql문장 다 다름
		- 공통된 로직
			- driver 로딩
			- Connection 생성..
				- Connection은 절대 공유 불가
					: 로컬변수로 생성 및 활용
			- 자원반환
			
2. table의 하나의 row값들을 자바 객체로 매핑
	- DeptDTO.java
	
3. 