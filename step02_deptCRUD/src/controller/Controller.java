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
	//��� �˻�
	/*�߻� ������ ����� ��
	 * 1. ���� ����
	 * 		- �����Ͱ� �ִ� : EndView���� ArrayList ��ü ����
	 * 		- �����Ͱ� ���� : EndView���� �˻��� ������ ����. �޼���
	 * 2. ������ ����
	 * 		- ���� �߻� : �˼��մϴ�. ��� �Ŀ� �� ��û �ٶ��ϴ�.. �޽���
	 */
	public void getDeptAll() {
		try {
			ArrayList<DeptDTO> datas = DeptDAO.getAll();
			if(datas.size() != 0) {
				EndView.printAll(datas);
			}else {
				EndView.succMsg("�˻��� ������ �����ϴ�.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			EndView.errorMsg("�˼��մϴ�. ����Ŀ� �� ��û �ٶ��ϴ�.");
		}
	}
	
	//insert
	/*�߻������� ����� ��
	 * 1. ���� ����
	 * 		1) true - ���� �Ϸ�, ���� ����
	 * 		2) false - ���ܴ� �ƴ����� ������ �� �߽��ϴ�..
	 * 2. ������ ����
	 * 		- �̹� �����ϴ� deptno�� ������ �õ� �� SQLException �߻�
	 * 		- �̹� �����ϴ� �޽���... 
	 * 
	 */
	
	public void getDept(int deptno) {
		try {
			DeptDTO datas = DeptDAO.getDept(deptno);
			if(datas != null) {
				EndView.printAll(datas);
			}else {
				EndView.succMsg("�˻��� ������ �����ϴ�.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			EndView.errorMsg("�˼��մϴ�. ����Ŀ� �� ��û �ٶ��ϴ�.");
		}
	}
	
	public void insert(DeptDTO newDto) {
		try {
			if(DeptDAO.insert(newDto)){
				EndView.succMsg("���ο� �μ����� ���� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("�̹� �����ϴ� deptno�Դϴ�.");
		}
	}
	
	public void update(int deptno, String newLoc) {
		try {
			if(DeptDAO.update(deptno, newLoc)){
				EndView.succMsg("�μ����� ���� ����");
			}else {
				EndView.errorMsg("�ش� �μ���ȣ�� �����ϴ�.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("�ش� �μ���ȣ�� ������ �� �����ϴ�.");
		}
	}
	
	public void delete(int deptno) {
		try {
			if(DeptDAO.delete(deptno)){
				EndView.succMsg("�μ����� ���� ����");
			}else {
				EndView.errorMsg("�ش� �μ���ȣ�� �����ϴ�.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("�ش� �μ���ȣ�� ������ �� �����ϴ�.");
		} 
	}
}
