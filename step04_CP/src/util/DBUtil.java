package util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBUtil {
	static DataSource ds = null;
	
	static {
		try {
			//서버의 설정 파일 정보 활용 가능한 자바 객체
			//설정 별칭으로 자원을 검색 및 받아서 활용
			//java:/comp/env - java component environment
			Context initContext = new InitialContext();
			Context envContext = (Context)initContext.lookup("java:/comp/env");
			ds = (DataSource)envContext.lookup("jdbc/myoracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Connection 객체 반환 메소드
	public static Connection getConnection() throws SQLException{
		return ds.getConnection();
	}
	
	
	//select문 자원 반환 - Connection, Statement,ResultSet
	public static void close(Connection con, Statement stmt, ResultSet rs) {
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
	
	
	//DML 자원 반환 - Connection, Statement
		public static void close(Connection con, Statement stmt) {
			try {
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
