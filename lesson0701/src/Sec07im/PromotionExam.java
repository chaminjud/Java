package Sec07im;

// �� ���Ͽ� �������� Ŭ������ ����� �͵� �����ϴ�.
// ��ſ� ���ϰ� ������ �̸��� Ŭ���� �̸��� ���� �Լ�(�����Լ�)�� �־���Ѵ�
class A {
	String fieldA;
	void methodA(){
		System.out.println("A�޼��� ���");
	}
}

class B extends A{
	String fieldB;
	@Override
	void methodA() {
		System.out.println("A�޼��带 �������̵� �ؼ� ���");
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
		 * �θ�Ÿ������ �ڵ�Ÿ�Ժ�ȯ�� �Ǹ� �θ�Ŭ������ �ʵ� �޼��� ������ �����ϴ�.
		 * ��� ������ �ڽİ�ü�� ���������� ������ ���� ������ ����� �θ� Ŭ������ �����ȴ�. 
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
		Ÿ�Ժ�ȯ�� �Ұ����ϴ�
	    */

	}

}
