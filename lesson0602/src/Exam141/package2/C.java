package Exam141.package2;

import Exam141.package1.*;

public class C {

	
	public void methodC() {
		// AŬ������ ��ü�� ����
		A a = new A();
		
		//a�� �ʵ带 ����
		
		a.field1 = 11;
		// a.field2 = 21; default �ʵ�� �ٸ� ��Ű�� �̹Ƿ� ���� �Ұ���
		// a.field3 = 31; private ���������� ��� �Ұ��� 
		
		//�޼��� ȣ��
		
		a.method1();
		// a.method2(); default �ʵ�� �ٸ� ��Ű�� �̹Ƿ� ���� �Ұ���
		// a.method3();  private ���������� ��� �Ұ���
   }
}