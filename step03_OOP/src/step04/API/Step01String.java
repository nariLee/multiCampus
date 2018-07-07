/*���ڿ� Ŭ������
 * 1. String
 * 		1) �ѹ� ������ ���ڿ� ��ü�� ������ ���� ���� �Ұ�
 * 		2) �⺻ Ÿ���� �ƴ����� " " ǥ�������� ���������� ��ü�� ����
 * 		3) ������Ű�� ����
 * 			" " or new String(" ")
 * 		4) (�ܿ��) ��ü ���� ����
 * 			(1) "" �������� ������ 
 * 				 - �̹� �����ϰ� ""���� ������ ���ڿ��� ���� ���ٸ� ����
 * 			(2) new String()
 * 				 - ������ ������ ������ ���� ��ü ����
 * */

package step04.API;

public class Step01String {

	public static void main(String[] args) {
		//step01 - String
		String d1 = "�̰���";
		String d2 = "�̰���";
		String d3 = new String("�̰���");
		String d4 = new String("�̰���");
		
		System.out.println(d1 == d2);	//true
		System.out.println(d2 == d3);	//false
		System.out.println(d3 == d4);	//false
		
		System.out.println("------------------------");
		//step02 - String �Һ� test
		//String concat(String addValue) 
		//concat(): �� �޼ҵ带 ������ ��ü�� ���뿡 parameter�� ���Ե� ���ڿ��� �߰�(add)�ϴ� ���
		d1.concat(" ���� ������");
		System.out.println(d1);	//�̰���
		
		System.out.println(d1.concat(" ���л�"));	//�̰��� ���л�
		
		d1 = d1.concat(" ���� ������");
		System.out.println(d1);	//�̰��� ���� ������
		
		
		/*String Ư¡ �� �Һ� ������ �ǽð� �������� ���ڿ� ���տ��� ����ӵ� ���� �߻�
		 * �ذ�å - java.lang.StringBuffer/StringBuilder ����
		 * 		- ���ڿ� ���� API
		 * 		- �������� ���ڿ� ǥ���� ����
		 * ����: jdk1.6���ʹ� String ��ü�� ���� performance�� jdk ��ü������ �׻�
		 */
		//String�� ���ο� ��ü�� ��� ����°Ÿ�, Builder�� �����޸𸮿� ��� �����Ű�� ��-> Builder�� �� �ӵ��� ����
		
	}

}
