package Exam141.package2;

import Exam141.package1.*;

public class C {

	
	public void methodC() {
		// A클래스의 객체를 만듬
		A a = new A();
		
		//a의 필드를 변경
		
		a.field1 = 11;
		// a.field2 = 21; default 필드는 다른 패키지 이므로 변경 불가능
		// a.field3 = 31; private 접근제한은 사용 불가능 
		
		//메서드 호출
		
		a.method1();
		// a.method2(); default 필드는 다른 패키지 이므로 변경 불가능
		// a.method3();  private 접근제한은 사용 불가능
   }
}
