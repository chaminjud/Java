package Sec05.lesson04;

import Sec05.lesson03.A;

public class D extends A{

	//생성자 선언
	public D() {
		
		//A생성자 호출
		super();
	}
	
	//메서드 선언
	
	public void method1() {
		// A 필드 변경
         this.field = "value";
         
         //A 메서드 호출
         this.method();
	}
	
	public void method2() {
		/*
		 * 상속을 받았어도 proctected 접근제한자가 있는 클래스를 직접 개체로 만들어 사용 할 수는 없다.
		 */
//		A a = new A();
//		a.field = "value";
//		a.method();
	}
}
