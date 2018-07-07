/*�н�����
 * 1. ������ key�� value �����ؼ� ���� �� Ȱ��
 * 2. ���ǻ���
 * 		1) key�� ���� �ߺ� ����
 * 		2) listó�� index ��ü�� ������
 * 		3) ���׸� �� Ÿ������ ����
 * 3. �ǽ��ܰ�
 * 		1) �ܼ� ���ڿ� ����
 * 		2) PeopleDto ����
 * 		3) ProbonoProject ����
 * 		4) ProbonoProject���� ����� ArrayList�� ����
 * 
 */
package step01.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import probono.model.dto.Activist;
import probono.model.dto.Probono;
import probono.model.dto.ProbonoProject;
import probono.model.dto.Recipient;
import step04_JavaUtil.PeopleDTO;

public class Step03MapTest {
	
	public static void m1() {
		HashMap<String, String> map = new HashMap<String, String>();
		//map.put("one","����");
		map.put("one","�Ѹ�");
		map.put("a","����");
		map.put("b","�Ѹ�");
		map.put("c","����");
		map.put("d","�Ѹ�");
		
		System.out.println(map);	//map.toString()
		System.out.println(map.get("one"));
		map.remove("one");
		System.out.println(map.get("one"));	//������ null
		
		
		/*? ������ �����ڿ� ������ Ȱ���ڴ� �ٸ�
		 * �����ڴ� HashMap ��ȯ, �� � key�� �ִ����� ��޾��� ��ȯ
		 * �޾Ƽ� ����ϴ� Ȱ���ڴ� key�� ��
		 * ��, API �޼ҵ�� keyȮ�� ����
		 * (hint) ��, key�� set ������ ���� 
		 * 
		 */
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		Iterator<String> allKey = keys.iterator();
		String k = null;
		while(allKey.hasNext()) {
			k = allKey.next();
			System.out.println(k+" "+map.get(k));
		}
		
	}
	
	public static void m2() {
		HashMap<String, PeopleDTO> all = new HashMap<String,PeopleDTO>();
		all.put("a", new PeopleDTO("����",25));
		all.put("b", new PeopleDTO("�泲",28));
		
		//?�泲�� �̸��� ��µǰ� ���ּ���
		System.out.println(all.get("b").getName());	//�ؿ��� ���ΰ�
		/*PeopleDTO man = all.get("b");
		String name = man.getName();
		System.out.println(name);*/
	}
	
	
	public static void m3() {
		ArrayList<ProbonoProject> all = new ArrayList<ProbonoProject>();
		
		//�����
		Activist audrey = new Activist("giver", "���帮", "pw1", "�̿�");
		//������
		Recipient receive = new Recipient("receivePeople", "����ȭ", "pw2", "�����������");
		//��� ��� ����
		Probono audreyHepbun 
			= new Probono("audreyHepbun", "���帮�ݹ� ������Ʈ", "������, ��ȭ���� ���α׷� ����, ���ä����� �� ��ȸ����, �̿�,ȯ�� ķ���� �� ��ȭ���������� �о�");
		//��� ��� ������Ʈ
		ProbonoProject audreyHepbunProject 
		= new ProbonoProject("���帮�ݹ� ������Ʈ", audreyHepbun, audrey, receive, "���̿�о�");
		
		
		//�����
		Activist audrey2 = new Activist("giver", "���帮", "pw1", "�Ǻΰ���");
		//������
		Recipient receive2 = new Recipient("receivePeople2", "����ȭ", "pw2", "�����������");
		//��� ��� ����
		Probono audreyHepbun2 = new Probono("��������", "�������� ������Ʈ", "������, ��ȭ���� ���α׷� ����, ���ä����� �� ��ȸ����, �̿�,ȯ�� ķ���� �� ��ȭ���������� �о�");
		//��� ��� ������Ʈ
		ProbonoProject audreyHepbunProject2 = new ProbonoProject("�������� ������Ʈ", audreyHepbun2, audrey2, receive2, "���̿�о�");
		
		all.add(audreyHepbunProject);
		all.add(audreyHepbunProject2);
		
		
		HashMap<String, ArrayList> allProject = new HashMap<String, ArrayList>();
		
		
		//key���� �𸣴� ��� keySet() �̿�
		allProject.put("project1", all);
		
		//? ����� �̸��� ���, ������Ʈ�̸�(������ó������Ʈ)�� ���
		
		//System.out.println(allProject.get("project1").get(1));
		int count = allProject.get("project1").size();
		
		for(int i=0; i<count; i++) {	
			System.out.println(all.get(i).getProbonoProjectName());
			System.out.println(all.get(i).getActivist().getName());
		}
		
		
		
		
		
		
		
		/*ProbonoProject project = all.get(0);		//���׸��� ����߱� ������ ����ȯ�� �ʿ����.
		Activist person = project.getActivist();
		String name = person.getName();
		System.out.println(name);
		
		System.out.println(all.get(0).getActivist().getName());	//���� 4���� ���� ��
*/	
		}
	
	public static void main(String[] args) {
		//m1();	//{one=�Ѹ�}   --->  one�� �ߺ��ż� ������(����)�� �Ѹ��� ����
		//m2();
		
		m3();
	}

}
