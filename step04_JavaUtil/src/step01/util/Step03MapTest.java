/*학습내용
 * 1. 고유한 key로 value 구분해서 관리 및 활용
 * 2. 주의사항
 * 		1) key는 절대 중복 불허
 * 		2) list처럼 index 자체가 미존재
 * 		3) 제네릭 즉 타입제약 가능
 * 3. 실습단계
 * 		1) 단순 문자열 저장
 * 		2) PeopleDto 저장
 * 		3) ProbonoProject 저장
 * 		4) ProbonoProject들이 저장된 ArrayList를 저장
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
		//map.put("one","영상");
		map.put("one","한림");
		map.put("a","영상");
		map.put("b","한림");
		map.put("c","영상");
		map.put("d","한림");
		
		System.out.println(map);	//map.toString()
		System.out.println(map.get("one"));
		map.remove("one");
		System.out.println(map.get("one"));	//삭제후 null
		
		
		/*? 데이터 제공자와 데이터 활용자는 다름
		 * 제공자는 HashMap 반환, 단 어떤 key가 있는지는 언급없이 반환
		 * 받아서 사용하는 활용자는 key를 모름
		 * 단, API 메소드로 key확인 가능
		 * (hint) 단, key는 set 구조로 관리 
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
		all.put("a", new PeopleDTO("영복",25));
		all.put("b", new PeopleDTO("경남",28));
		
		//?경남씨 이름만 출력되게 해주세요
		System.out.println(all.get("b").getName());	//밑에꺼 줄인거
		/*PeopleDTO man = all.get("b");
		String name = man.getName();
		System.out.println(name);*/
	}
	
	
	public static void m3() {
		ArrayList<ProbonoProject> all = new ArrayList<ProbonoProject>();
		
		//기부자
		Activist audrey = new Activist("giver", "오드리", "pw1", "미용");
		//수혜자
		Recipient receive = new Recipient("receivePeople", "나문화", "pw2", "무상컷팅희망");
		//재능 기부 내용
		Probono audreyHepbun 
			= new Probono("audreyHepbun", "오드리햅번 프로젝트", "예술가, 문화관련 프로그램 제공, 전시ㆍ관람 등 기회제공, 미용,환경 캠페인 등 문화ㆍ예술관련 분야");
		//재능 기부 프로젝트
		ProbonoProject audreyHepbunProject 
		= new ProbonoProject("오드리햅버 프로젝트", audreyHepbun, audrey, receive, "헤어미용분야");
		
		
		//기부자
		Activist audrey2 = new Activist("giver", "나드리", "pw1", "피부관리");
		//수혜자
		Recipient receive2 = new Recipient("receivePeople2", "나문화", "pw2", "무상컷팅희망");
		//재능 기부 내용
		Probono audreyHepbun2 = new Probono("슈바이쳐", "슈바이쳐 프로젝트", "예술가, 문화관련 프로그램 제공, 전시ㆍ관람 등 기회제공, 미용,환경 캠페인 등 문화ㆍ예술관련 분야");
		//재능 기부 프로젝트
		ProbonoProject audreyHepbunProject2 = new ProbonoProject("슈바이쳐 프로젝트", audreyHepbun2, audrey2, receive2, "헤어미용분야");
		
		all.add(audreyHepbunProject);
		all.add(audreyHepbunProject2);
		
		
		HashMap<String, ArrayList> allProject = new HashMap<String, ArrayList>();
		
		
		//key값을 모르는 경우 keySet() 이용
		allProject.put("project1", all);
		
		//? 기부자 이름들 출력, 프로젝트이름(슈바이처프로젝트)들 출력
		
		//System.out.println(allProject.get("project1").get(1));
		int count = allProject.get("project1").size();
		
		for(int i=0; i<count; i++) {	
			System.out.println(all.get(i).getProbonoProjectName());
			System.out.println(all.get(i).getActivist().getName());
		}
		
		
		
		
		
		
		
		/*ProbonoProject project = all.get(0);		//제네릭을 사용했기 때문에 형변환이 필요없음.
		Activist person = project.getActivist();
		String name = person.getName();
		System.out.println(name);
		
		System.out.println(all.get(0).getActivist().getName());	//위의 4줄을 줄인 것
*/	
		}
	
	public static void main(String[] args) {
		//m1();	//{one=한림}   --->  one이 중복돼서 기존값(영상)에 한림을 저장
		//m2();
		
		m3();
	}

}
