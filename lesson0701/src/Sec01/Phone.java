package Sec01;

public class Phone {

	//�ʵ�
	public String model;
	public String color;
	
	
	
	//������ - �⺻������ Phone(){};
     public Phone(String model, String color) {
    	 this.model = model;
    	 this.color = color;
		System.out.println("Phone(String model, String color) ������ ����");
	 }
	
	//�޼ҵ�
	public void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	public void sendVoice(String message) {
		System.out.println("�� : "+ message);
	}
	public void receiveVoice(String message) {
		System.out.println("���� : "+ message);
	}
	
	public void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
	
}
