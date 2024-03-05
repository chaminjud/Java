package Sec01;

public class SmartPhone extends Phone {

	//필드
	public boolean wifi;
	
	//생성자
	public SmartPhone(String model, String color) {
		super(model, color); //사용해도되고 안해도됨
		System.out.println("SmartPhone(String model, String color) 생성자 실행 됨");
	}
	
	//메소드
	public void setwifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결 합니다.");
	}
}
