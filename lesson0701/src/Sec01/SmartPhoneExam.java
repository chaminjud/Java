package Sec01;

public class SmartPhoneExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone myPhone = new SmartPhone("������", "��ũ���");
		
		//Phone���� ���� ��ӹ��� �ʵ带 �б�
		System.out.println("��: "+myPhone.model);
		System.out.println("����: "+myPhone.color);
		
		//SmartPhone �ʵ�
		System.out.println("�������� ����: "+myPhone.wifi);
		
		//Phone���� ���� ��� ���� �޼ҵ� ȣ��
		myPhone.bell();
		myPhone.sendVoice("��������");
		myPhone.receiveVoice("�ȳ��ϼ���? ���� ���� ��ǰ�� �־� ��ȭ��Ⱦ��");
		myPhone.sendVoice("���� ���� �ٻ���. ����");
		myPhone.hangUp();
		
		//SmartPhone �޼ҵ� ȣ��
		myPhone.setwifi(true);
		myPhone.internet();
		
		
	}

}
