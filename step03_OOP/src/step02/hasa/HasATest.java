/*�н�����
 * 1. ��ü ���� ����� ���(����)�Ǵ� ���踦 "has a"����
 * 2. ����
 * 		has a [�����, ����]
 * 3. ����
 * 		- ����� is a[�����, ����] �� ǥ��
 * 		- �� �Ӽ�(������)���� ������ ��쿡�� ��� ����
 * 		����: ���� Ŭ������ �� Ŭ���� ������ ��� ����
 * 
 * */

package step02.hasa;

public class HasATest {
	static void printAll(Person p) {
		System.out.println("�����̸�: "+p.myCar.engine.getEngineName());
		System.out.println("cc: "+p.myCar.engine.getCc());
		System.out.println("person: "+p.getName());
		System.out.println("----------------------------------");
	}
	
	static void setAll(Person p) {
		p.myCar.engine.setEngineName("new�����̸�");
		p.myCar.engine.setCc(1000);
		p.setName("�̳���2");
	}
	public static void main(String[] args) {
		//String -> Engine -> Car -> Person & String
		/*�λ���� �� ���� Person ��ü ����
		 * �����̸�, cc, Person�� �̸��� �� �����Ͻð�
		 * ���
		 */
		Person p1 = new Person();
		Person p2 = new Person();
		
		
		printAll(p1);
		setAll(p2);
		printAll(p2);
		
	}

}
