/*�н�����
 * 1. ������ Ÿ��
 * 		Ÿ�� ������;
 * 2. �޼ҵ��� Ÿ��
 * 		��ȯŸ��, argument�� �����ϴ� ���� Ÿ��
 * 		��ȯŸ�� �޼ҵ��( [Ÿ�� ������,...] ){}
 * 3. Ÿ������ ��� ������ Ÿ���� ����?
 * 		1) int�� ���� �⺻ Ÿ�� - �� 8����
 * 		2) Stringó�� JDK ���ο� class�� �������ִ� Ÿ��
 * 		3) ����ڰ� ���� �����ϴ� Ŭ����
 * */

package step01.test;
import step01.domain.FriendVO;
import step01.syntax.step01Method;

public class Test2 {
	
	void m1(String v) {}
	
	//String�� ��ȯ�ϴ� �޼ҵ� ����
	String m2() {
		return "ee";
	}
	
	void m3(FriendVO v) {}
	
	//FieldVO
	public static void main(String[] args) {
		Test2 t = new Test2();
		System.out.println(t.m2());
		t.m1("��");
		t.m3(new FriendVO());
	}

}
