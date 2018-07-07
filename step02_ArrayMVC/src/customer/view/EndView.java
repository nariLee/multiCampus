package customer.view;

import customer.domain.CustomerDTO;

public class EndView {
	//��� �� ���� ���
	public static void printAll(CustomerDTO[] all) {
		for(int i=0; i<all.length; i++) {
			if(all[i] != null) {
				System.out.println(all[i].toString());
			}
		}
	}
	
	
	//�����Ͱ� null�� ��� �ܼ� �޽��� ���
	public static void printOne(CustomerDTO one) {	//�ش� ���̵� ������
		System.out.println(one.toString());
	}


	public static void printMsg() {	//�ش� ���̵� ������
		System.out.println("��û�Ͻ� ������ �� �����մϴ�.");
	}


	public static void printMsg(String msg) {
		System.out.println(msg);
	}
	
	//�����Ͱ� CustomerDTO�� ��� �ش� ������ ���� ���
}
