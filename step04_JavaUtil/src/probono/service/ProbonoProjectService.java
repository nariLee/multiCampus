/* 1. ���� ���ο� �� ��ü ���� �ϳ��� ���������� �����ϴ� ���߱���
 * 2. singleton design pattern
 * 		1) ��ü ���� ������ �ϳ�
 * 		2) ���� ����
 * 			(1) �����ڴ� �ܺ� Ŭ�������� ����
 * 				  - private ������([..])
 * 			(2) ������ Ŭ���� ������ ������ ȣ��
 * 				  - ��ü ����
 * 			(3) ������ ��ü�� �ܺ� Ŭ�������� ����ϰ� �Ϸ���?
 * 				  - ������ ��ü�� �ּҰ� ��ȯ
 * 				  - �� ����� �޼ҵ�� public
 * 				  - �� �޼ҵ� ȣ�� ������ �ܺ� Ŭ�������� ��ü �������� ȣ��
 * 					 ���� �޼ҵ�� static 
 */
package probono.service;

import java.util.ArrayList;

import probono.model.dto.Activist;
import probono.model.dto.People;
import probono.model.dto.Probono;
import probono.model.dto.ProbonoProject;
import probono.model.dto.Recipient;

public class ProbonoProjectService {
	
	private static ProbonoProjectService instance = new ProbonoProjectService();
	
	
	//private ProbonoProject[] projectList = new ProbonoProject[10];
	ArrayList<ProbonoProject>projectList = new ArrayList<>();
	//int count = projectList.size(); ���⿡�� �ʱ�ȭ�� �ϸ� ũ�Ⱑ 0���� �Ǿ ������ ��
	
	//private int index;	//�ʿ伺 ���� Ȯ��

	private ProbonoProjectService(){}
	
	public static ProbonoProjectService getInstance(){
		return instance;
	}
	
	//��� Project ��ȯ
	public ArrayList getAllProjects() {
		return projectList;
	}

	//Project �˻�
	public ProbonoProject getProbonoProject(String projectName) {
		ProbonoProject project = null;
		for (int i = 0; i < projectList.size(); i++) {
			if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
				project = projectList.get(i);
				break;
			}
		}
		return project;
	}

	//Project �߰�
	public void projectInsert(ProbonoProject project) {
		
		projectList.add(project);
	}
	
	
	//??? ������ ���� �޼ҵ�� Ȯ���ϱ�
	//instanceof - ��ü Ÿ�� �� ������ Ȱ��
	//Project ���� - ������Ʈ ������ ��� ����� ���� 
	public void projectUpdate(String projectName, People people){
		
		ProbonoProject project = getProbonoProject(projectName);
		
		if(people instanceof Recipient) {
			Recipient recipient = (Recipient)people; 
			project.setReceive(recipient);
			//project.setReceive((Recipient)people);
			
		} else if(people instanceof Activist) {
			Activist activist = (Activist)people; 
			project.setActivist(activist);
			//project.setActivist((Activist)people);
		}
		
	}
	
	
	int count = projectList.size();
	
	 //Project ���� - ������Ʈ������ �ش� ������Ʈ ����
	public void projectDelete(String projectName) {
		for (int i = 0; i < count; i++) {
			if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
				projectList.remove(i);
				break;
			}
		}
	}
	
	//ArrayList�� ������ ������ ��ȯ���ִ� size() ȣ�� ��
		/*������ ���� ���� ��� ������ ������ ���� �Ŀ� ���� ��� ����
		 * �޼ҵ� ȣ�� �� ��ɸ� ���� �ȵǰ� ���� performance�� ���
		 * 
		 */
	/*public void projectDelete2(String projectName) {
		for (int i = 0; i < projectList.size(); i++) {
			if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
				projectList.remove(i);
				break;
			}
		}
	}*/
	
	
		
	
	
	//Project ����
	public int projectListSize(){
		return projectList.size();
	}
}
