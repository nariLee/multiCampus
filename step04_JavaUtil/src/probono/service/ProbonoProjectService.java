/* 1. 서버 내부에 이 객체 수를 하나만 절대적으로 보장하는 개발구조
 * 2. singleton design pattern
 * 		1) 객체 수는 무조건 하나
 * 		2) 개발 구조
 * 			(1) 생성자는 외부 클래스에게 은닉
 * 				  - private 생성자([..])
 * 			(2) 동일한 클래스 내에서 생성자 호출
 * 				  - 객체 생성
 * 			(3) 생성된 객체를 외부 클래스에서 사용하게 하려면?
 * 				  - 생성된 객체의 주소값 반환
 * 				  - 이 기능의 메소드는 public
 * 				  - 이 메소드 호출 시점은 외부 클래스에서 객체 생성없이 호출
 * 					 따라서 메소드는 static 
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
	//int count = projectList.size(); 여기에서 초기화를 하면 크기가 0으로 되어서 오류가 뜸
	
	//private int index;	//필요성 여부 확인

	private ProbonoProjectService(){}
	
	public static ProbonoProjectService getInstance(){
		return instance;
	}
	
	//모든 Project 반환
	public ArrayList getAllProjects() {
		return projectList;
	}

	//Project 검색
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

	//Project 추가
	public void projectInsert(ProbonoProject project) {
		
		projectList.add(project);
	}
	
	
	//??? 다형성 적용 메소드로 확장하기
	//instanceof - 객체 타입 비교 연산자 활용
	//Project 수정 - 프로젝트 명으로 재능 기부자 수정 
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
	
	 //Project 삭제 - 프로젝트명으로 해당 프로젝트 삭제
	public void projectDelete(String projectName) {
		for (int i = 0; i < count; i++) {
			if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
				projectList.remove(i);
				break;
			}
		}
	}
	
	//ArrayList의 데이터 개수를 반환해주는 size() 호출 시
		/*데이터 수가 많을 경우 가급적 변수에 대입 후에 변수 사용 권장
		 * 메소드 호출 시 기능만 보면 안되고 실행 performance도 고려
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
	
	
		
	
	
	//Project 개수
	public int projectListSize(){
		return projectList.size();
	}
}
