package Sec11;

public class CalssName {

	
	//�ν��Ͻ� ���
	int field1; // �ʵ�
	void method() {} //�޼���
	
	//���� ���
	static int field2; // �����ʵ�
	static void method2() { // ���� �޼���
		
	}
	
	//���� ����
	static {
		// �������� ������ �ν��Ͻ� ����� ������� ���ϱ� ����
		// field1 =10; ������ ����
	    // method(); ������ ����
	    field2 = 10;
	    method2();
	}
	
	
	//���� �޼���
	static void method3() {
		//this.field1 = 10; this�� ��� �Ұ�
		//this.method1(); // �޼��� ���� ��� �Ұ���
		field2 = 10;
		method2();
	}
}