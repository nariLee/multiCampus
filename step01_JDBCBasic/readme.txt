학습 내용

1. sql + 프로그램 연동
2. 사용 언어와 DB종류
	Oracle, java[JDBC API]
3. JDBC API
	1) Java Database Connectivity 표준 API
	2) db 종류와 무관하게 동일한 코드로 개발
4. 예시
	Oracle : DB2 : MS Sql : My Sql : Maria : 큐브리드
	각 DB와 접속을 위한 메소드
		Connection getConnection(String uri, String pw)
	자바 언어로 DB와 접속하고자 할때는 해당 메소드만 호출
		Connection con = getConnection("ip", "SCOTT", "TIGER");
		
	1) 접속을 위한 메소드는 반드시 다음과 같아야 함 (rule=스펙)
		- 명령문 + 미완성 메소드 선언구만 제시 - Interface
		Connection getConnection(String uri, String id, String pw);
		- (구)Sun mycrosystems에서 제시
		
	2) DB 벤더사는 스펙에 맞게 개발
		Connection getConnection(String uri, String id, String pw){
			각 벤더사에 맞게 실제 완벽한 구현
			DB접속 기능의 객체 생성해서 반환
		}
		
	3) DB를 사용하는 자바 개발자
		- Connection con = getConnection("ip", "SCOTT", "TIGER");
		
5. sqlplus로 DB와 소통하는 작업 단계
	1단계 - db 실행중..
	2단계 - sqlplus 실행
	3단계 - db 접속 > sqlplus id/pw 엔터
	4단계 - 접속 완료
	5단계 - sql문장 작성 엔터
	6단계 - 결과를 output
	7단계 - 결과 활용
	8단계 - exit 접속 해제
	
6. sqlplus로 DB와 소통하는 작업 단계 & java API(JDBC)와 매핑
	1단계 - db 실행중..
	2단계 - 자바 코드 시작
	3단계 - db 접속 : Connection 객체 생성 요청(uri, id, pw)
	4단계 - 접속 완료 : Connection 객체 생성 완료 - DB접속 완료
	5단계 - sql문장 작성 엔터sql 문장 실행
			Statement 객체 생성 - sql 문장 실행하는 자바 객체
			sql문장 실행 메소드 실행
			  select - 결과집합(ResultSet)
			  	ResultSet executeQuery("Select문 실행 메소드")
			  	
			  insert/update/delete[DML] - DB table에 영향을 미친 행수
			  	int executeUpdate("dml"){}
			  	
	6단계 - 결과를 output
			ResultSet
				결과 row 존재 여부 확인 가능
					boolean next()
				해당 row의 특정 컬럼값 반환 기능
					int getInt()
					double getDouble()
					String getString("컬럼명" or "검색된컬럼순번")
					...
				
					number(8)	정수
					number(2,1)	실수
					char(10)
					varchar2(10)
	7단계 - 결과 활용
	8단계 - exit 접속 해제
		close()
		
7. DB연동 프로그램 개발시 고려사항
	1) DB 시스템이 혹여 다운?
	2) DB의 ip가 변경?
	3) DB의 table의 구조 변경?
	4) sql문장 오류?
	-- SQLException 으로 경우의 수 처리 필수로 유도
	...
	*JDBC API - java.sql packages
	
8. review[Design Pattern]
	1) DataTransfer Object(Value Object, Java Bean)
		- DTO/VO
	2) MVC
		- Model
		- View
		- Controller
	3) SingleTon pattern
	4) Data Access Object(DAO)
		- DB와 전담 소통을 하는 class
		- sql문장 + JDBC api로만 구성
		- DAO 클래스들이 공통적으로 사용하는 클래스 또 분리