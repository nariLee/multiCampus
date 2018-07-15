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
	//모든 검색
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
			datas = new ArrayList<DeptDTO>();	//rs에 정상적으로 데이터가 저장되면 datas 객체를 생성
			
			while(rs.next()) {
				datas.add(new DeptDTO(rs.getInt(1), rs.getString(2), rs.getString(3)));	//배열과는 다르게 인덱스가 1부터 시작
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;	//catch 내에서 throw 해야만 end user에게 상황전달 가능
		} finally {
			DBUtil.close(con, stmt, rs);
		}
		
		return datas;
	}
	
	//deptno로 해당 부서 정보 검색
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
			throw e;	//catch 내에서 throw 해야만 end user에게 상황전달 가능
		} finally {
			DBUtil.close(con, pstmt,rs);
		}
		
		return datas;
	}
	
	//새로운 부서 정보 저장
	//insert into dept values(?,?,?)
	//insert into dept values(50, '총무부', '역삼')
	/*
	 * DeptDTO newDept
	 * "insert into dept values("+
	 * new DeptDTO(getDeptno()+",'"+newDept.getDname()+",'역삼'))"
	 */
	public static boolean insert(DeptDTO newDept) throws SQLException{
		Connection con = null;
		//이 객체가 생성되는 시점에 이미 고정된 sql문장 내장
		PreparedStatement pstmt = null;	//alt+shift+r -> 변수명 한번에 바꾸기
		
		try {
			con = DBUtil.getConnection();
			//고정된 문장으로 sql 실행 객체 생성
			pstmt = con.prepareStatement("insert into dept01 values(?,?,?)");
			//?에 데이터값 순차적으로 셋팅
			pstmt.setInt(1, newDept.getDeptno());
			pstmt.setString(2, newDept.getDname());
			pstmt.setString(3, newDept.getLoc());
			
			//db에 실제 실행
			int result = pstmt.executeUpdate();	//insert/update/delete 실행 메소드
			if(result == 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;	//catch 내에서 throw 해야만 end user에게 상황전달 가능
		} finally {
			DBUtil.close(con, pstmt);
		}
		
		return true;
	}
	
	//deptno로 loc 수정
	//?
	public static boolean update(int deptno, String newLoc) throws SQLException{
		
		Connection con = null;
		PreparedStatement pstmt = null;	//alt+shift+r -> 변수명 한번에 바꾸기
		
		try {
			con = DBUtil.getConnection();
			//고정된 문장으로 sql 실행 객체 생성
			pstmt = con.prepareStatement("update dept01 set loc=? where deptno=?");
			//?에 데이터값 순차적으로 셋팅
			pstmt.setString(1, newLoc);
			pstmt.setInt(2, deptno);
			
			//db에 실제 실행
			int result = pstmt.executeUpdate();	//insert/update/delete 실행 메소드
			if(result == 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;	//catch 내에서 throw 해야만 end user에게 상황전달 가능
		} finally {
			DBUtil.close(con, pstmt);
		}
		
		return true;
	}
	
	
	//deptno로 해당 부서 삭제
	public static boolean delete(int deptno) throws SQLException{
		
		Connection con = null;
		PreparedStatement pstmt = null;	//alt+shift+r -> 변수명 한번에 바꾸기
		
		try {
			con = DBUtil.getConnection();
			//고정된 문장으로 sql 실행 객체 생성
			pstmt = con.prepareStatement("delete from dept01 where deptno=?");
			//?에 데이터값 순차적으로 셋팅
			pstmt.setInt(1, deptno);
		
			
			//db에 실제 실행
			int result = pstmt.executeUpdate();	//insert/update/delete 실행 메소드
			if(result == 0) {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;	//catch 내에서 throw 해야만 end user에게 상황전달 가능
		} finally {
			DBUtil.close(con, pstmt);
		}
		
		return true;
	}
	
}
