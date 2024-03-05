package Sec05.lesson03;

/*
 * class A를 public으로 생성한다.
 * 안에는 String타입의 field와 method()가 있다
 * 이 필드와 메서드는 내부 또는 자식클래스만이 접근 가능하다.
 * 
 * class B에서 메서드를 선언한 후 A클래스를 a로 객체화ㅣ 하여 필드와 메서드를 호출하여보자
 * 
 * 다른 패키지에 C클래스를 만든 후 B와 같이 a를 만들어 호출해 보자
 * C클래스가 있는 패키지에 D클래스를 만든 후 A클래스를 상속하여 
 * 호출해 보고 객체를 만들어 필드를 호출해 보자
 */
public class A {

	protected String field;
	
	
	protected void method() {
		
	}
	



	
}
