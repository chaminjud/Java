package Exam141.package1;

public class A {
 
	//�ʵ� ����
	public int field1; // public �ʵ�
	
	int field2; // default�ʵ�
	
	private int field3;// private
	
	
	//������
	public A() {
		//Ŭ���� ���ο����� ������������ ������ ����
		field1 = 1;
		field2 = 2;
		field3 = 3;
		
		method1();
		method2();
		method3();
	}
	
	//method
	public void method1() {}
	void method2() {}
	private void method3() {}
}
