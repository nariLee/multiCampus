package step01;

public class InstanceofTest {

	public static void main(String[] args) {
		//equals()�� ��ü������ �ּҰ��� ���ϴ� ��.
		//String�� Integer ��ü������ ���� ��� ��ü�� �ּҰ��� ���ϴ� ���� �ƴ϶�, �����Ͱ��� ���ϴ� ������ 
		//�ڹٰ� ������ ������.
		//String ��ü�� ���밪 ��
		System.out.println("data".equals("data"));	//true
		
		//Integer ��ü�� ���밪 ��
		Integer i = new Integer("3");
		Integer i2 = new Integer("33");
		System.out.println(i.equals(i2));	//false
		
		//���� �ٸ� Ÿ���̱� �ϳ� equals()�� parameter�� Object
		/*java.lang.Object�� ��� ��ü Ÿ���� �ֻ���
		 * �⺻ Ÿ�� 8������ ������ ��� Ÿ�� �� ���밡��*/
		System.out.println(i.equals("���ڿ�"));		//Ÿ���� �޶� false
		
		//1
		System.out.println(i.equals("3"));	//Ÿ���� �޶� false
		//2
		System.out.println("3".equals(i));	//Ÿ���� �޶� false		---> ���빰���ٴ� Ÿ���� ���� ���ϰ� Ÿ���� �ٸ��� false
		
		
		//����� ���� ��ü�� ���밪 ��
		
		
		//Object�� �ڽ� String, Integer,...
		/*��ü Ÿ�� �� ������
		 * 1. �񱳺���(��) instanceof Ÿ��
		 * 2. �������� : ��Ӱ��迡���� �� ����
		 * 
		 * */
		System.out.println("string"instanceof Object);	//true
		System.out.println("string" instanceof String);	//true
		
		//String�� Integer�� ��� ���谡 �ƴ�. ���� �� �Ұ�
		//System.out.println("string" instanceof Integer);		//��������
		
		
		System.out.println("������----");
		AA a = new AA();
		AA a2 = new AA();
		System.out.println(a.equals(a2));	//false. --> Ÿ���� ������ �ּҰ��� �޶� �ٸ� ��ü�� �ν�
														//������ �Ŀ��� true
		
	}

}

class AA extends Object{
	int data;
	
	AA(){}
	AA(int d){
		this.data = d;
	}
	//��ü�� �ּҰ� ���ߴ� �޼ҵ带 ���밪(������) �񱳷� ������
	/*AA ��ü�� ��
	 * 1. AA Ÿ�Կ��� �� (Ÿ�Ժ񱳸� �����ؾ���) - instanceof ������ �̿�
	 * 2. AA Ÿ���� ��ġ�ȴٸ� AA��ü���� ������ ��������� ��
	 * 		Object Ÿ���� ������ ��ӽ�Ų �޼ҵ常 ȣ��
	 * 		�ڽĸ��� ����� ȣ���ϱ� ���ؼ��� ����ȯ �ʼ�
	 * */
	
	public boolean equals(Object o) {
		if(o instanceof AA) {	//1��.
			AA a = (AA)o;	//data ��� ���� �񱳸� ���� ����ȯ
			if(data == a.data) {	//2��.
				return true;
			}
		}
		return false;
	}
}
