package Sec01;

public class SmartPhone extends Phone {

	//�ʵ�
	public boolean wifi;
	
	//������
	public SmartPhone(String model, String color) {
		super(model, color); //����ص��ǰ� ���ص���
		System.out.println("SmartPhone(String model, String color) ������ ���� ��");
	}
	
	//�޼ҵ�
	public void setwifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("�������� ���¸� �����߽��ϴ�.");
	}
	
	public void internet() {
		System.out.println("���ͳݿ� ���� �մϴ�.");
	}
}
