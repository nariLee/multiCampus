//������ �ͼ�������
package step03.apply;

public class PolyTest extends Object{	//�ڵ��߰��� �ڵ�

	public PolyTest() {
		super();
	}
	
	//���ڿ� ��ü ������ Object(�ֻ���) Ÿ������ ��ȯ
	//Object ���� = "���ڿ�"; �� �� (upcasting)
	public static Object getData() {
		
		return "���ڿ�";	//String ��ü ���� -> ��ȯ
	}
	public static void main(String[] args) {
		
		PolyTest p = new PolyTest();
		System.out.println(p);
		System.out.println(p.toString());	//p�� p.toString()���� ����. toString()�޼ҵ尡 �ּҰ��� ��ȯ�ϵ��� ���ǵǾ�����.
		
		String data = (String)getData();	//downcasting ����ȯ
		System.out.println(data.charAt(0));	//charAt()�� String�� ���� �޼ҵ�
		
		Integer i = new Integer(33);
		System.out.println(i);
		System.out.println(i.toString());	//�Ѵ� 33�� ����. 
		
		//�������: getData() -> getData().charAt(0) -> (String)
		//System.out.println((String)getData().charAt(0));	
		System.out.println(((String)getData()).charAt(0));	
	}

}
