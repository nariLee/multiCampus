

/*�н�����
 * 1. �޼ҵ� ����(����, �����)
 * 		- ��Ģ���� �������� test
 * 2. �޼ҵ� ȣ��(���)
 * 3. ���� ��ġ
 * 		- class ���� �������� ���� ����
 * 		- �޼ҵ� ���ο� �޼ҵ� ���� �Ұ�
 * 		- �޼ҵ� ���ο��� �޼ҵ� ȣ�� ����
 * 4. �⺻ ����(*)
 * 		- ��ȯŸ�� �޼ҵ��( [arguments] ) { [����] }
 * 		- ��ȯ�� Ÿ�Կ� �°� ��ȯŸ�� ����
 * 		- ��ȯ�� ���� �޼ҵ��� ��� ��ȯŸ�Կ� void�� ����
 * 5. ����
 * 		- �����ڿ� ���� ��
 * 			������ ����: Ŭ������( [arguments] ) { [����] }
 *
 * */


package step01.syntax;

public class step01Method {
	
	
	public step01Method() {}
	public int sum() {
		return 3+5;
	}
	public int sum2(int no1, int no2) {
		return no1+no2;
	}
	
	public void sum(int no1, int no2, int no3) {
		System.out.println(no1+no2+no3);
	}
	//+ ���� ����� �޼ҵ� ����
	/*���� ����� ��
	 * ����� �� 1 - ���� �����ͷ� ���ؼ� ��ȯ
	 * ����� �� 2 - ���� �����ͷ� ���ؼ� ��ȯ
	 * */

	public static void main(String[] args) {
		//1�ܰ� - �޼ҵ� ȣ���ϱ� ���� ��ü ����
		step01Method s = new step01Method();
		int v1 = s.sum();
		System.out.println(v1);
		int v2 = s.sum2(100, 200);
		System.out.println(s.sum2(100, 200));
		System.out.println(v2);
		s.sum(3,5,6);
	}
}
