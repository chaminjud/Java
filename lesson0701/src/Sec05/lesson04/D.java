package Sec05.lesson04;

import Sec05.lesson03.A;

public class D extends A{

	//������ ����
	public D() {
		
		//A������ ȣ��
		super();
	}
	
	//�޼��� ����
	
	public void method1() {
		// A �ʵ� ����
         this.field = "value";
         
         //A �޼��� ȣ��
         this.method();
	}
	
	public void method2() {
		/*
		 * ����� �޾Ҿ proctected ���������ڰ� �ִ� Ŭ������ ���� ��ü�� ����� ��� �� ���� ����.
		 */
//		A a = new A();
//		a.field = "value";
//		a.method();
	}
}
