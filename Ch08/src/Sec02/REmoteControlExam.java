package Sec02;

public class REmoteControlExam {

	public static void main(String[] args) {
		System.out.println("�ִ� ������ :" + RemoteControl.MAX_VOLUME + "�Դϴ�.");
		System.out.println("�ִ� ������ :" + RemoteControl.MIN_VOLUME + "�Դϴ�.");
		RemoteControl cc;
		
		cc = new Television();
		cc.turnOn();
		
		cc = new Audio();
		
		cc.turnOn();

		cc.setVolume(5);
		cc.setMute(true);
		cc.setMute(false);
		cc.tunrOff();
		System.out.println();
		RemoteControl.changeBattery();
	}

}
