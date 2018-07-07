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

package step01;

public class PeopleDTO {	//DTO�� VO ����
	private String name;		//heap
	private int age;		//heap
	
	public PeopleDTO() {}
	public PeopleDTO(String newName, int newAge) {
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
	
	/*@Override
	 * - �ּ����� �� ���� ������� ��ɾ�
	 * - �ش� ���忡 �°� ������ �� �ϸ� ���� ������ �߻�
	 * @��ɾ�
	 * 		-@override: �� �޼ҵ�� �ݵ�� ������ �ϼ��� ��� ���
	 * @: ��
	 */
	@Override	//toString(int i)������ �ϸ� @override��ɾ���� ������ ��.
	/*public String toString() {
		return "PeopleDTO [name=" + name + ", age=" + age + "]";
	}*/
	
	public boolean equals(Object o) {//Object o = p2;
		
			if(o instanceof PeopleDTO) {
				PeopleDTO p2 = (PeopleDTO)o;
				if(name == p2.name && age == p2.age) {
					return true;
				}
			}
			return false;
		}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PeopleDTO [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}	
	
}
