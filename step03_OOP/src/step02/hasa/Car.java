package step02.hasa;

public class Car {
	Engine engine = new Engine();
	
	//engine 이름이 출력되는 메소드 개발
	void printEngineName() {
		System.out.println(engine.engineName);
	}
	
	//engine의 기본 cc만 출력
	void printCC() {
		System.out.println(engine.getCc());
	}
}
