package view;

import controller.Controller;
import model.domain.DeptDTO;

public class StartView {

	public static void main(String[] args) {
		Controller controller = Controller.getInstance();
		
		/*//��� �˻�
		controller.getDeptAll();
		//insert
		controller.insert(new DeptDTO(50,"������","���ﵿ"));
		controller.insert(new DeptDTO(10,"������","���ﵿ"));*/
		//deptno�� �˻�
		//controller.getDept(20);
		//controller.update(20, "����");
		//controller.getDeptAll();
		//controller.insert(new DeptDTO(7,"������","���ﵿ"));
		//controller.delete(6);
		controller.getDeptAll();
		//controller.getDept(30);
	}

}
