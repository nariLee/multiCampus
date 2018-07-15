package view;

import controller.Controller;
import model.domain.DeptDTO;

public class StartView {

	public static void main(String[] args) {
		Controller controller = Controller.getInstance();
		
		/*//¸ðµç °Ë»ö
		controller.getDeptAll();
		//insert
		controller.insert(new DeptDTO(50,"±³À°ºÎ","¿ª»ïµ¿"));
		controller.insert(new DeptDTO(10,"±³À°ºÎ","¿ª»ïµ¿"));*/
		//deptno·Î °Ë»ö
		//controller.getDept(20);
		//controller.update(20, "°­³²");
		//controller.getDeptAll();
		//controller.insert(new DeptDTO(7,"±³À°ºÎ","¿ª»ïµ¿"));
		//controller.delete(6);
		controller.getDeptAll();
		//controller.getDept(30);
	}

}
