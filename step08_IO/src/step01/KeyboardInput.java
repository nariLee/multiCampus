/*�н�����
 * 1. �ǽð� Ű����� �Է��� �����͸� �ǽð� �ܼ�â�� ���
 * 2. �������
 * 		Ű���� �Է�(System.in) -> ���� -> �ֿܼ� ���(System.out)
 * 		1) �ǽð�: �ݺ���
 * 		2) read/write �޼ҵ�
 * 		3) ������ ���� ���� ����
 * 			- String ������ ���� ���� ����
 * 			- �� ���� null
 * 			- readLine(): Line ������ read
 * 3. IO�� ���� performance�� ����� ���� API�� ����
 * 		1) �ӵ��� ���
 * 			- BufferedReader/BufferedWriter
 * 			- �ý��� ���� �ϵ���� ��� ���� �޸� ���
 * 			- ��� �Ŀ� �ڵ�� �ڿ� ��ȯ �ʼ�
 * 		2) �ɼ�
 * 
 * 4. �������� ���ǻ���
 *      - ��� API�� �ݵ�� ����� ��ȯ���� �����͸� �޸𸮰� ������ ���·� �������� ����� �� �� ���� ����
 *    		  ��? ���� �޸� ũ�⸸ŭ �����Ͱ� �������� ������ ���� �޸𸮿� �����͸� �����ϰ� �ִ� ��Ȳ 
 *        �� ���� ������ ��ŭ �����Ͱ� ������ �ִٸ� �ڵ� ����̵ȴ�. (autoflush), 
 *        ���� ������ �ս� ������ ���� auto flush ����� �޼ҵ� �ڵ� 
 * 
 */
package step01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInput {

	//step01 - Ű���� -> �ܼ�â�� ���
	/*public static void main(String[] args) {
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		try {
			String data = in.readLine();
			while(data != null) {
				System.out.println(data);	//���
				data = in.readLine();	//�Է�
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {	//�ڿ���ȯ
			try {
				in.close();	//����ó���� �ʿ���
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}*/
	
	
	//step02 : Ű���� -> data.txt ���Ϸ� ���
	/*public static void main(String[] args) {
		
		//read ��ü
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		
		//data.txt ���Ͽ� 2byte�� ���
		BufferedWriter out = null;	//try �ȿ� �����ϸ� �ڿ���ȯ�� �� �� ����
		
		try {
			out = new BufferedWriter(new FileWriter("data.txt"));
			String data = in.readLine();
			while(data != null) {
				out.write(data);
				out.newLine();
				data = in.readLine();	//�Է�
				out.flush();	//������ �ս��� ���ؼ� �������� ������ ��� ����
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {	//�ڿ���ȯ
			try {
				in.close();	//����ó���� �ʿ���
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}*/
	
	
	//step03 - ���Ϸκ��� read�ؼ� ���
	public static void main(String[] args) {
		
		//read ��ü
		BufferedReader in = null;
		
		
		//data.txt ���Ͽ� 2byte�� ���
		BufferedWriter out = null;	//try �ȿ� �����ϸ� �ڿ���ȯ�� �� �� ����
		
		try {
			in = new BufferedReader (new FileReader("data.txt"));
			out = new BufferedWriter(new FileWriter("newData.txt"));
			String data = in.readLine();
			while(data != null) {
				out.write(data);
				out.newLine();
				System.out.println(data);
				data = in.readLine();	//�Է�
				out.flush();	//������ �ս��� ���ؼ� �������� ������ ��� ����
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {	//�ڿ���ȯ
			try {
				in.close();	//����ó���� �ʿ���
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	//split����ؼ� �����͵� �ϳ��� ���
}
