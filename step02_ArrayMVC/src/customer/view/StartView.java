package customer.view;

import customer.controller.CustomerController;
import customer.domain.CustomerDTO;

public class StartView {

	public static void main(String[] args) {
		//��� �˻� - null�� ��� ���� ��� �Ұ�
		System.out.println("*****��� �˻�*****");
		 CustomerController.all();
		 
		 
		//�˻� - id�� �˻�
		 System.out.println("*****id�� �˻�*****");
		CustomerController.getOne("tester");
		CustomerController.getOne("tester2");
		
		
		//���� - id�� �ߺ��Ǹ� ���� �Ұ�
		System.out.println("*****����*****");
		CustomerDTO newOne = new CustomerDTO("man","������","77",26,"vip");
		CustomerController.addOne(newOne);
		CustomerController.all();
		
		
		System.out.println("*****����*****");
		//���� - �����ϴ� ������ ����, �������ϴ� ������ �����õ�?
		CustomerController.deleteOne("tester");
		CustomerController.deleteOne("tester");
		CustomerController.all();
		
		
		//���� - �����ϴ� ������ ����, �������ϴ� ������ �����õ�?
		/*id�� ����� ����
		 * ��, ���� ����? ������ ���� �������ο� ���� ��Ȳ�� �ݵ�� ����
		 * */
		System.out.println("*****����*****");
		CustomerController.updateOne("master", "vvvip");
		CustomerController.all();
		
	
	}

}
