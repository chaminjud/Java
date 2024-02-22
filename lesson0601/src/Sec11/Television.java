package Sec11;

public class Television {
	//인스턴스 필드는 new라는 생성자를 만든 후에 사용 가능하고
	//정적필드는 생성자 없이 사용 가능하다.

	//인스턴스 필드
	int pay = 20000000;
	String color;
	

	// 정적 필드(static) , 정적필드는 일반적으로 바로 초기화를 한다.
	static String company = "LG";
	static String model = "OLED";
	static String info;
	
	//정적 블럭을 선언하는 방법 static{}
	static {
		info = company + "-" + model;
	}
	
	//정적 메서드
	static void method2() {
		System.out.println(info);
	}
	
	
	//인스턴스 메서드
	void method1(int getPay) {
		this.pay = getPay;
		this.color= "빨강";
		System.out.println(this.pay + "," + this.color + info);
	}
	//인스턴스 메서드에서 정적필드를 사용할 수 있고 사용할때는 this를 사용할 필요가 없고
	//인스턴스 메서는 객체가 생성 되어야지만 사용할 수 있기 때문에 
	//정적메서드 에서 인서턴스 필드를 사용할 수 없다
	
	//결론
	//정적 멤버 안에서 인스턴스 멤버는 사용할 수 없다.
	//인스턴스 멤버 안에서 정적 멤버는 사용할 수 있다.
	
	
	
}
