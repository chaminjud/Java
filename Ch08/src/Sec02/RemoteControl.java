package Sec02;

public interface RemoteControl {
    //�������̽����� �ʵ�� public ������� ���� �� �ִ�
	//�������̽� �������� �ʵ忡 ���� �����ϸ� �װ��� �� ����̴�.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	//�������̽� ������ ���ǵǴ� �޼���� ��� �߻� �޼����̴�.
	 void turnOn();
	 void tunrOff();
	 void setVolume(int volume); 
	
	//����Ʈ �޼���
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�");
			setVolume(MIN_VOLUME);
			
		}else {
			System.out.println("������ �����մϴ�.");
		}
	}
	
	//���� �޼���
	static void changeBattery() {
		System.out.println("�������� ��ȯ �մϴ�.");
	}
}
