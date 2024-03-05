package Sec10;

public class PhoneExam {

	public static void main(String[] args) {
		
		
		// Phone phone = new Phone(); Phone은 추상클라스이기 때문에 객체 생성이 불가능하다.
		
		// Phone smartphone1 = new SmartPhone("홍길동"); 자식객체를 사용하여 클라스를 만드는 것은 가능하다.
		
		SmartPhone smartphone = new SmartPhone("홍길동");
		
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
		
		
	}

}
