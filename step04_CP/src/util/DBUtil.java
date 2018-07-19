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
			//������ ���� ���� ���� Ȱ�� ������ �ڹ� ��ü
			//���� ��Ī���� �ڿ��� �˻� �� �޾Ƽ� Ȱ��
			//java:/comp/env - java component environment
			Context initContext = new InitialContext();
			Context envContext = (Context)initContext.lookup("java:/comp/env");
			ds = (DataSource)envContext.lookup("jdbc/myoracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Connection ��ü ��ȯ �޼ҵ�
	public static Connection getConnection() throws SQLException{
		return ds.getConnection();
	}
	
	
	//select�� �ڿ� ��ȯ - Connection, Statement,ResultSet
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
	
	
	//DML �ڿ� ��ȯ - Connection, Statement
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
