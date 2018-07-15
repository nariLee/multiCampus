package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.domain.DeptDTO;
import util.DBUtil;

public class DeptDAO {
	//��� �˻�
	//select * from dept
	public static ArrayList<DeptDTO> getAll() throws Exception{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<DeptDTO> datas = null;
		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from dept01");
			datas = new ArrayList<DeptDTO>();	//rs�� ���������� �����Ͱ� ����Ǹ� datas ��ü�� ����
			
			while(rs.next()) {
				datas.add(new DeptDTO(rs.getInt(1), rs.getString(2), rs.getString(3)));	//�迭���� �ٸ��� �ε����� 1���� ����
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;	//catch ������ throw �ؾ߸� end user���� ��Ȳ���� ����
		} finally {
			DBUtil.close(con, stmt, rs);
		}
		
		return datas;
	}
	
	//deptno�� �ش� �μ� ���� �˻�
	//?
	public static DeptDTO getDept(int deptno) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		DeptDTO datas = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnection();
			
			pstmt = con.prepareStatement("select * from dept where deptno=?");
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				datas = new DeptDTO(rs.getInt(1),rs.getString(2),rs.getString(3));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;	//catch ������ throw �ؾ߸� end user���� ��Ȳ���� ����
		} finally {
			DBUtil.close(con, pstmt,rs);
		}
		
		return datas;
	}
	
	//���ο� �μ� ���� ����
	//insert into dept values(?,?,?)
	//insert into dept values(50, '�ѹ���', '����')
	/*
	 * DeptDTO newDept
	 * "insert into dept values("+
	 * new DeptDTO(getDeptno()+",'"+newDept.getDname()+",'����'))"
	 */
	public static boolean insert(DeptDTO newDept) throws SQLException{
		Connection con = null;
		//�� ��ü�� �����Ǵ� ������ �̹� ������ sql���� ����
		PreparedStatement pstmt = null;	//alt+shift+r -> ������ �ѹ��� �ٲٱ�
		
		try {
			con = DBUtil.getConnection();
			//������ �������� sql ���� ��ü ����
			pstmt = con.prepareStatement("insert into dept01 values(?,?,?)");
			//?�� �����Ͱ� ���������� ����
			pstmt.setInt(1, newDept.getDeptno());
			pstmt.setString(2, newDept.getDname());
			pstmt.setString(3, newDept.getLoc());
			
			//db�� ���� ����
			int result = pstmt.executeUpdate();	//insert/update/delete ���� �޼ҵ�
			if(result == 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;	//catch ������ throw �ؾ߸� end user���� ��Ȳ���� ����
		} finally {
			DBUtil.close(con, pstmt);
		}
		
		return true;
	}
	
	//deptno�� loc ����
	//?
	public static boolean update(int deptno, String newLoc) throws SQLException{
		
		Connection con = null;
		PreparedStatement pstmt = null;	//alt+shift+r -> ������ �ѹ��� �ٲٱ�
		
		try {
			con = DBUtil.getConnection();
			//������ �������� sql ���� ��ü ����
			pstmt = con.prepareStatement("update dept01 set loc=? where deptno=?");
			//?�� �����Ͱ� ���������� ����
			pstmt.setString(1, newLoc);
			pstmt.setInt(2, deptno);
			
			//db�� ���� ����
			int result = pstmt.executeUpdate();	//insert/update/delete ���� �޼ҵ�
			if(result == 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;	//catch ������ throw �ؾ߸� end user���� ��Ȳ���� ����
		} finally {
			DBUtil.close(con, pstmt);
		}
		
		return true;
	}
	
	
	//deptno�� �ش� �μ� ����
	public static boolean delete(int deptno) throws SQLException{
		
		Connection con = null;
		PreparedStatement pstmt = null;	//alt+shift+r -> ������ �ѹ��� �ٲٱ�
		
		try {
			con = DBUtil.getConnection();
			//������ �������� sql ���� ��ü ����
			pstmt = con.prepareStatement("delete from dept01 where deptno=?");
			//?�� �����Ͱ� ���������� ����
			pstmt.setInt(1, deptno);
		
			
			//db�� ���� ����
			int result = pstmt.executeUpdate();	//insert/update/delete ���� �޼ҵ�
			if(result == 0) {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;	//catch ������ throw �ؾ߸� end user���� ��Ȳ���� ����
		} finally {
			DBUtil.close(con, pstmt);
		}
		
		return true;
	}
	
}
