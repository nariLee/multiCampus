/*?1. Parent2 ��� �ޱ�
 * 2. int no2 ���� �� �ʱ�ȭ(�� ����)
 * 3. printAll() ������
 * 4. �������� ����� ��ü�� main���� ����
 * 5. printAll() ȣ��
 * 6. Child2���� no2 ���� 100���� ����
 * 7. no2 ���� ���
 * */

package step01;

public class Child2 extends Parent2{
	int no2 = 0;
	void printAll() {
		System.out.println(no2);
	}
	public static void main(String[] args) {
		Parent2 p = new Child2();
		Child2 c = (Child2)p;	//p�� c�� ���� �ּҰ�
		c.no2 = 100;
		p.printAll();		//100
		System.out.println(p.no1);	//10
		p.no1 = 1000;
		System.out.println(c.no1);//1000
	}

}


class Parent2 {
	int no1 = 10;
	void printAll() {
		System.out.println(no1);
	}
}