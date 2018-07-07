/*�н�����
 * 1. java.util.Set ApI �н�
 * 2. Set Ư¡
 * 		1) �ߺ� ������ ����(������ �����͸� ����)
 * 		2) ������ ����. ��, ������ �ϳ��ϳ� ��ȯ�� ��� Iterator API Ȱ��
 * 		3) ������ ���� ������ ���� ������ �����ڰ� �Ұ� 
 * 
 */
package step01.util;

import java.util.HashSet;
import java.util.Iterator;

public class Step02SetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		
		set.add("a��������");
		set.add("��������a");	//�ߺ������� ����
		set.add("��������a");
		set.add("������d");
		set.add("c����������");	//������ �ٲ㼭 �����ص� ���������� ������ ������������

		System.out.println(set.toString());
		
		/*Set ���ο� �ִ� �����͵��� �ϳ��ϳ��� ��ȯ�޾� ����ϱ�
		 * 1. Iterator
		 * 		- ��� �����͵��� ������ �������� �����ؼ� �ϳ��� ��밡���ϰ� ���ִ� API
		 * 		- ������ ���� Ȯ�� ��� - hasNext()
		 * 		- ������ ��� ��ȯ�ϴ� ��� - next()
		 * 2. ���� ������ ���� �غ��� (�ǻ��ڵ�)
		 * 		1�ܰ� - HashSet ��ü�� �����͵��� Iterator�� ��ȯ
		 * 		2�ܰ� - Iterator���� ������ ���� ���� Ȯ��
		 * 				 : �ݺ��� �ʿ�
		 * 					for?(�ݺ�Ƚ�� ��Ȯ�Ҷ�) while? do~while?(������ 1���̻� �����Ҷ�) ---> while
		 * 		3�ܰ� - ������ ��� 
		 * 					������ ��ȯ
		 * 			   - �������� ���
		 * 					����
		 * 
		 */
		Iterator all = set.iterator();
		String data = null;
		while(all.hasNext()) {
			data = (String) all.next();
			System.out.println(data);
			//System.out.println(all.next());	//set�� �ִ� �����͸� �ϳ��� ���
		}
		
		System.out.println("-----------");
		//���׸� �ݿ� �� ����ȯ���� ��ü��(element) Ȱ��
		Iterator<String> all2 = set.iterator();	//Iterator�� ���׸��� ����� �� �ִ�.
		String data2 = null;
		while(all2.hasNext()) {
			data2 = all2.next();
			System.out.println(data2);
			
		}
	}

}
