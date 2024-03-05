package Sec05.lesson03;

public class B{
	
	
	/*
	 * 접근제한자 protected는 같은 패키지 내에서는 public, default와 같이 자유롭게 사용이 가능하다.
	 */
	
	//메서드 선언
	public void method() {
	
	A a = new A();
	
	a.field = "value";
	a.method();
	
}
     
     
	
}
