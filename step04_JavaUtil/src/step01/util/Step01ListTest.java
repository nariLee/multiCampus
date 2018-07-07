/*�н� ����
 * 1. �ֿ� API
 * 		1) java.util
 * 		2) ArrayList - ���� �迭�� ���
 * 			- ù ������ 10���� �޸� ����
 * 			- 11��° ������ ������ 10���� �߰� ����
 * 		3) �޼ҵ�
 * 			(1) ������ ����: add(Object o)
 * 			(2) ������ ����: remove(int index)
 * 			(3) ������ ��ȯ: get(int index)
 * 			(4) ������ ����: size()
 */
package step01.util;

import java.util.ArrayList;	//java.lang��Ű���� ������ ��� ��Ű���� import�ؾ���.

public class Step01ListTest {

	public static void main(String[] args) {
		System.out.println("--- ���׸� �� �ݿ� ---");	//���׸��� �Ⱦ��� ObjectŸ�� ��ü
		ArrayList a = new ArrayList();
		a.add(3);	//new Integer(3)
		a.add("ans");	//? ans���� index 1��°�� ���ڿ� ��ü���� ������ charAt(1)
											//�̶� ans�� 3�� Object ��ü��.
		String v = (String)a.get(1);	
		System.out.println(v.charAt(1));
		
		System.out.println(((String)a.get(1)).charAt(1));	//���� ������ ���ٷ� ���� ��
		
		
		System.out.println("--- ���׸� ������ list jdk1.5���� ����---");
		//String�鸸 ���� ������. ���� �޸��� �迭 ���� ��ü ����
		//Ÿ�� ���� - ���׸�
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(list.size());		//0

		//������ ����
		list.add("�̳���");	//0��° �ڵ� ����
		
		//���׸� ������ ����ȯ ���� index ������
		//���� ������ Ÿ���� ��ü�� ��ȯ
		System.out.println(list.get(0).charAt(2));	//�� ���. ���ʹ� �ٸ��� String��ü�̱� ������ ����ȯ�� �ʿ����
		list.add("�ѱǿ�");
		list.add("������");
		list.add("������");
		//list.add(new Integer(3));	//���� ���� ��? StringŸ������ �����س��� ������ String�� ���� ���� 
		System.out.println(list.size());	//4
		
		//index�� 1�� ����� ������ ��ȯ �� ���
		System.out.println(list.get(1));	//�ѱǿ�
		
		//������ ����
		list.remove(1);
		System.out.println(list.size());	//3
		System.out.println(list.get(1));	//������
		
		System.out.println(list);	//�̳���, ������, ������ ��� ���
	}

}
