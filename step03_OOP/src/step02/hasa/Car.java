package step02.hasa;

public class Car {
	Engine engine = new Engine();
	
	//engine �̸��� ��µǴ� �޼ҵ� ����
	void printEngineName() {
		System.out.println(engine.engineName);
	}
	
	//engine�� �⺻ cc�� ���
	void printCC() {
		System.out.println(engine.getCc());
	}
}
