/*Wrapper class�� �н�
 * 1. �ʿ伺
 * 		- ����: ��ü�� ���� ������ �迭, ��ü�� ���� ������ �ڷ� ���� ���� �⺻ Ÿ�԰��� �����ϰ� ���� �� ���� �Ұ�
 * 		- �ذ�å: �⺻ Ÿ���� ������ �� Ÿ�Ժ� ����Ʈ Ŭ������ ����
 * 					java.lang�� 8������ ����
 * 2. ����
 * 		byte - 2           :              Byte - new Byte(2)
 * 		short - 3          :              Short - new Short(3) 
 * 		int: Integer
 * 		long: Long
 * 	
 * 3. 	��ü Ÿ�԰� �⺻ Ÿ�԰��� ȣȯ ����: jdk1.5 ���� �߰�
 * 		������: Integer i = new Integer(3)
 * 				 int i = 3;
 * 		�Ź���: - Integer i = 2;       --------> autoboxing
 * 				    ������ ���� Integer i = new Integer(2);���� ��ȯ
 * 			     - int i = new Integer(2);				---------> unboxing
 * 				    ������ ���� int i = (new Integer(2)).intValue();
 */

package step04.API;

public class Step02Wrapper {

	public static void main(String[] args) {
		String s = "3";
		System.out.println(s.equals(3));	//false
		System.out.println(s.equals(new Integer(3)));	//false	//���� �ڵ尡 ���������� ���� �����.
	}

}
