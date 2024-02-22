package sec06;

public class Car {
	
	/*
	 * -생성자 오버로딩-
	 * 매개값으로 객체의 필드를 다양하게 초기화 하는 것 - 오버로딩 Overloading
	 * 매개변수를 달리하는 생성자를 여러개 생성하는 것을 '생성자 오버로딩'이라고 한다
	 * 생성자 오버로딩은 0~최대값까지 가능하다
	 * 매개변수의 갯수가 같을때는 타입이 달라야 하고 아니면 매개변수의 개수가 달라야한다.
	 * */

	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car(){
		this("그랜저","빨강", 300);
	}
	Car(String model) {
		this(model, "빨강", 300);
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
//	Car(String color, String model){
//		위에랑 같은 타입이라 불가능
//	}
	Car(String model, int maxSpeed){
		this.model = model;
		this.maxSpeed = 300;
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
