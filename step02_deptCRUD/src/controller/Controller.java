package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import model.DeptDAO;
import model.domain.DeptDTO;
import view.EndView;

public class Controller {
	private static Controller instance = new Controller();
	private Controller() {}
	
	public static Controller getInstance() {
		return instance;
	}
	//모든 검색
	/*발생 가능한 경우의 수
	 * 1. 정상 실행
	 * 		- 데이터가 있다 : EndView에게 ArrayList 객체 전송
	 * 		- 데이터가 없다 : EndView에서 검색한 데이터 없다. 메세지
	 * 2. 비정상 실행
	 * 		- 예외 발생 : 죄송합니다. 잠시 후에 재 요청 바랍니다.. 메시지
	 */
	public void getDeptAll() {
		try {
			ArrayList<DeptDTO> datas = DeptDAO.getAll();
			if(datas.size() != 0) {
				EndView.printAll(datas);
			}else {
				EndView.succMsg("검색한 데이터 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			EndView.errorMsg("죄송합니다. 잠시후에 재 요청 바랍니다.");
		}
	}
	
	//insert
	/*발생가능한 경우의 수
	 * 1. 정상 실행
	 * 		1) true - 저장 완료, 저장 성공
	 * 		2) false - 예외는 아니지만 저장은 못 했습니다..
	 * 2. 비정상 실행
	 * 		- 이미 존재하는 deptno값 재저장 시도 시 SQLException 발생
	 * 		- 이미 존재하는 메시지... 
	 * 
	 */
	
	public void getDept(int deptno) {
		try {
			DeptDTO datas = DeptDAO.getDept(deptno);
			if(datas != null) {
				EndView.printAll(datas);
			}else {
				EndView.succMsg("검색한 데이터 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			EndView.errorMsg("죄송합니다. 잠시후에 재 요청 바랍니다.");
		}
	}
	
	public void insert(DeptDTO newDto) {
		try {
			if(DeptDAO.insert(newDto)){
				EndView.succMsg("새로운 부서정보 저장 성공");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("이미 존재하는 deptno입니다.");
		}
	}
	
	public void update(int deptno, String newLoc) {
		try {
			if(DeptDAO.update(deptno, newLoc)){
				EndView.succMsg("부서정보 수정 성공");
			}else {
				EndView.errorMsg("해당 부서번호가 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("해당 부서번호를 수정할 수 없습니다.");
		}
	}
	
	public void delete(int deptno) {
		try {
			if(DeptDAO.delete(deptno)){
				EndView.succMsg("부서정보 삭제 성공");
			}else {
				EndView.errorMsg("해당 부서번호가 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("해당 부서번호를 삭제할 수 없습니다.");
		} 
	}
}
