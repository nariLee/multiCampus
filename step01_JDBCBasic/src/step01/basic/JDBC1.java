/*oracle driver를 로딩 -> Connection() -> Statement -> sql 문장 실행
 * -> ResultSet or int -> 결과값 활용 -> 자원반환
 * 
 */
package step01.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC1 {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt=null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			/*
			 * java.sql.Connection은 (구)sun에서 제시한 DB접속 API
			 * interface 즉 실제 완벽하게 구현되게 아니라 구현하라는 명령들로만 구성
			 * 실제 구현은 각 회사가 직접 구현...ojdbc6.jar로 압축해서 제공
			 * 따라서 실제 반환받은 Connection은 완벽한 자식 객체이고 다형성이 반영된 부모타입으로 upcasting
			 */
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SCOTT", "TIGER");
			//Connection con2 = DriverManager.getConnection("", "SCOTT", "TIGER"); //여러개 연결 가능

			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from dept");	//sql문에 세미콜론쓰지 않음	
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString("dname")+" "+rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				
				if(stmt != null) {
					stmt.close();
					stmt = null;
				}
				
				if(con != null) {
					con.close();
					con = null;
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}
	}

}
