package Sec04_3;

public class AB_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A aa = new A(); //�θ� Ŭ��������
		
		aa.method1();  // �θ������� AŬ�������� ������
		aa.method2();  // �θ������� AŬ�������� ������
		
		B bb = new B(); // �ڽ�Ŭ���� ����
 		
		bb.method1(); 
		// super.�޼ҵ��̸�(); �� ����߱⶧���� �θ������� method1()�� ������
		bb.method2();  
		// ** �������� int���ǰ� ���⶧���� ������ �����ʰ� �θ������� AŬ������ �޼ҵ带 ��ӹ޾� ������
		bb.method2(3);
		// �Ű������� int���� ��������� ������ �ڽ������� BŬ�������� ������
		
	}

}
