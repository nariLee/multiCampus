/*Data Transfer Object = Value Object = Java Bean
 * 1. ����Ģ
 *     - ������DTO.java / ������VO.java / ������Bean.java /������    --> ȸ�縶�� �ٸ�.
 * 2. ����
 *     - ��� ����: private
 *     - ��� �޼ҵ�: ���� �� �����Ͱ� ��ȯ, �����Ͱ� ���� �������θ� ����
 *     					 ������ ���� �޼ҵ忡�� ���� ��ȿ�� ���� ����
 *     - ������: �⺻ ������, ��� ������ �ʱ�ȭ ������
 *     - toString: ��� ������ �� �����ؼ� ��ȯ�ϴ� �޼ҵ�
 * */

package util;

public class Practice {	//DTO�� VO ����
	private String name;		//heap
	private int age;		//heap
	
	public Practice() {}
	public Practice(String newName, int newAge) {
		name = newName;
		age = newAge;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "PeopleDTO [name=" + name + ", age=" + age + "]";
	}
	
	public boolean equals(Object o) {
		if(o instanceof Practice) {
			Practice p = (Practice)o;
			if(name == p.name && age == p.age) {
				return true;
			}
		}
		return false;
	}
	
}
