package step01.domain;
//�� ���� �ּ�
/* ���ϴ����� �ּ�
 * 1. �����͸� �ڹ� ���� ǥ���ϴ� ��� ����
 * 2. ������ = �ڹ� ����(����)
 * 3. ����
 * 		1) ģ���� ���������α׷�ȭ
 * 			- �̸�(���ڿ�, String)
 * 			- ������(���ڿ�, String)
 * 			- ����(����, int)
 * 		2) ����, ����, ����
 * 4. ���� ����
 * 		1) ģ������ ���?
 * 5. �ʼ� �ϱ� ����
 * 		- ������ ����/����/����/�˻�
 * 		 create/delete/update/select
 *      - CRUD [��������]
 *      	C[create]/R[select]/U[update]/D[delete]
 * 6. ����
 * 		1) class ����
 * 		2) ���� ����, ���� ȣ��(���)
 * 			Ÿ�� ������ [= ������];		//[]: ��������
 * 		3) ��ü ����
 * 			- Ŭ������ ��ü�� �ƴ�
 * 			- �޸𸮿��� ���� ��� ������ ������ �����͵��� ������ �޸� ����
 * 			   �� �޸𸮴� ����, ���� ���� ����
 * 			- ����
 * 				Ŭ����Ÿ�� ������ = new Ŭ������()	//��ü����
 * 7. ������
 * 		1) ��ü(instance)�� ������ �� �ְ� ���ִ� ������ �������.
 * 		2) ��� Ŭ������ ������ ����
 * 			- �����ڰ� ���ڵ��� ������ ������ �ڵ�����.
 * 			- ��, �ʿ信 ���ؼ� �ڵ�� ������ ���� ������ ����� �����Ϸ��� ���� �ڵ��߰����� ����.
 * 8. �н�����
 * 		1) Ŭ���� ���� ���
 * 		2) ���� ���� ���
 * 		3) ��ü ���� ���� ���
 * 		4) �������� Ŭ������ �����ؼ� ���
 * 		5) import
 * 		6) public
 * 		7) ���� �޸𸮿� �����ؼ� ��� ������ ��ü�� instance��� ��.
 * 		8) ������
 * 			- �������� () �뵵
 * 			- ()�ȿ� ����� ����: �Ű�����, argument, parameter..
 */  
 
public class FriendVO {
	
	public String name;
	public String cellPhone;
	public int age;
	

	//��� ������ ���� �����ϴ�(�ʱ�ȭ) ������
	//3���� �����͸� �޾Ƽ� ��� ������ ����
	public FriendVO() {
	}
	
	public FriendVO(String n, String c, int a) {
		name = n;
		cellPhone = c;
		age = a;
	}
}