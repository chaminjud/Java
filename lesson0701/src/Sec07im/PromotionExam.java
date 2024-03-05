package Sec07im;

// 한 파일에 여러개의 클래스를 만드는 것도 가능하다.
// 대신에 파일과 동일한 이름의 클래스 이름과 메인 함수(실행함수)가 있어야한다
class A {
	String fieldA;
	void methodA(){
		System.out.println("A메서드 출력");
	}
}

class B extends A{
	String fieldB;
	@Override
	void methodA() {
		System.out.println("A메서드를 오버라이드 해서 출력");
	}
	void methodB() {}
}
class C extends A{}
class D extends B{}
class E extends C{}
public class PromotionExam {

	public static void main(String[] args) {
		
		A b = new B();
		
		b.fieldA = "valueA";
		b.methodA();
		
		
		/*
		 * 부모타입으로 자동타입변환이 되면 부모클래스의 필드 메서에 접근이 가능하다.
		 * 비록 변수가 자식객체를 참조하지만 변수로 접근 가능한 멤버는 부모 클래스로 한정된다. 
		 */
//		b.fieldB = "valueB" 
//	    b.methodB();
		
		
		
		B b1 = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b2 = d;
		C c1 = e;
		
		/*
		B b2 = e;
		C c2 = d;
		타입변환이 불가능하다
	    */

	}

}
