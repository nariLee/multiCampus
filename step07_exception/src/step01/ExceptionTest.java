package step01;

public class ExceptionTest {

	public static void main(String[] args) {
		
		System.out.println(1);
		try {
			System.out.println(10/0);	
		}catch(ArithmeticException e) {
			e.printStackTrace(); 	//���ܹ߻� �� ������ �ܼ�â�� ���
		}
		
		System.out.println(2);	//2�� ��µ��� ����
		
		//byte code�� �޸𸮿� �ε��ϴ� ����� API
		/*forName() �޼ҵ� ������ ����
		 * 1. parameter Ŭ������ �޸𸮿� �ε�
		 * 2. �� ���� ���� �߻� ������ ����Ǽ�
		 * 		1) ����: �ε�(����) ����
		 * 		2) ������: ������ ��Ȳ�� �� �޼ҵ� ȣ���� ���� �˷���
		 * 3. ����� �� ��δ� ������ ó�� ���
		 * 		1) �� �޼ҵ带 ����� ��� ������ �߻� ������ �Ҿ��� �Ҽ��� �ִ� ��Ȳ�� ó���ϰ��� ����
		 *  
		 * 
		 */
		
		/*try {
			Class.forName("step01.A");	//��Ű����.Ŭ������
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}*/
		
		
		
	}
	
}

class A{
	static {
		System.out.println("A�� byte code�� �ε��Ǿ����ϴ�.");
	}
}
