package customer.controller;

import customer.domain.CustomerDTO;
import customer.model.CustomerModel;
import customer.view.EndView;

public class CustomerController {
	//��� �˻�
	public static void all() {
		EndView.printAll(CustomerModel.getAll());
		/*CustomerDTO[] all = CustomerModel.getAll();
		EndView.printAll(all);*/
	}
	//id�� �ش� �� ������ �˻�
	/*Model�� getOne()�� ��ȯ��
	 * - CustomerDTO or null
	 * - EndView���� ����� ������ �� �� �ΰ��� �����͸� ��� ��� ��û?
	 * ���� ����� ����� ��
	 * 1) ����� ��1
	 *     - EndView�� �޼ҵ忡 ������ ��� ����
	 *       : EndView�� null ���� ����
	 * 2) ����� ��2 (�������� �̰� ���)
	 * 		- Controller���� null ����
	 * 		- null�� ��� �ٸ� ��� �޼ҵ� ȣ��, null�� �ƴ� ��� �Ǵٸ� �޼ҵ� ȣ��
	 */
	public static void getOne(String id) {
		CustomerDTO one = CustomerModel.getOne(id);
		if(one != null) {	//�˻��� �����Ͱ� ������ ��� true
			EndView.printOne(one);
		} else {
			EndView.printMsg();
		}
	}
	
	
	
	//grade�� �ش� ��޵鸸 �˻�
	
	//����
	public static void addOne(CustomerDTO newDTO) {
		int result = CustomerModel.addOne(newDTO);
		if(result != 5) {
			EndView.printMsg("ȸ������ �Ϸ�");
		}else {
			EndView.printMsg("�˼��մϴ�. ���� ���� ������ �Ұ��Դϴ�.");
		}
	}
	
	//���� - id�� �������� grade ����
	
	//���� - id
	public static void deleteOne(String id) {
		boolean result = CustomerModel.deleteOne(id);
		if(result) {
			EndView.printMsg(id+" ȸ���� ���� ����");
		}else {
			EndView.printMsg("���� ����");
		}
	}
	
	//���� - grade
	public static void updateOne(String id, String grade) {
		boolean result = CustomerModel.updateOne(id, grade);
		if(result) {
			EndView.printMsg(id+" ȸ���� ��� "+grade +"�� ���� ����");
		} else {
			EndView.printMsg("���� ����");
		}
	}
}
