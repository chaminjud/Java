package Sec02;

public class REmoteControlExam {

	public static void main(String[] args) {
		System.out.println("최대 볼륨은 :" + RemoteControl.MAX_VOLUME + "입니다.");
		System.out.println("최대 볼륨은 :" + RemoteControl.MIN_VOLUME + "입니다.");
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
