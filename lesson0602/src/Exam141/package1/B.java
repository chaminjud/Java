package Exam141.package1;

public class B {

	
	public void methodB() {
		// A클래스의 객체를 만듬
		A a = new A();
		
		//a의 필드를 변경
		
		a.field1 = 11;
		a.field2 = 21;
		// a.field3 = 31; private 접근제한은 사용 불가능 
		
		//메서드 호출
		
		a.method1();
		a.method2();
		// a.method3();  private 접근제한은 사용 불가능
	}
}
