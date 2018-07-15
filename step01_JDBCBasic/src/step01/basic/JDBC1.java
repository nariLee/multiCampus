/*oracle driver�� �ε� -> Connection() -> Statement -> sql ���� ����
 * -> ResultSet or int -> ����� Ȱ�� -> �ڿ���ȯ
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
			 * java.sql.Connection�� (��)sun���� ������ DB���� API
			 * interface �� ���� �Ϻ��ϰ� �����ǰ� �ƴ϶� �����϶�� ��ɵ�θ� ����
			 * ���� ������ �� ȸ�簡 ���� ����...ojdbc6.jar�� �����ؼ� ����
			 * ���� ���� ��ȯ���� Connection�� �Ϻ��� �ڽ� ��ü�̰� �������� �ݿ��� �θ�Ÿ������ upcasting
			 */
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SCOTT", "TIGER");
			//Connection con2 = DriverManager.getConnection("", "SCOTT", "TIGER"); //������ ���� ����

			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from dept");	//sql���� �����ݷо��� ����	
			
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
