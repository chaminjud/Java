package Sec10;

public class Dog extends Animal{

	//추상 메서드 재정의
	@Override
	public void sound() {
		System.out.println("개가 짖습니다.");
		
	}

}
