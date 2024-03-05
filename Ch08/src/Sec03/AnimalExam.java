package Sec03;

public class AnimalExam {

	public static void main(String[] args) {
		
		Animal ani; // 인터페이스 객체는 생성자를 만들어 줄 필요 없이 사용 가능하다 
		            // 쉽게 int a; 이런 선언을 생각하자
		
		ani = new Dog();
		//선언한 변수는 animal에 삽입(implements)된 클래스를
		//생성자 선언 후에 사용 가능하다. 이때 new Dog()에 타입은 Animal타입으로 자동 변환된다/
		
		ani.cry();
		
		ani = new Cat();
		
		ani.cry();

	}

}
