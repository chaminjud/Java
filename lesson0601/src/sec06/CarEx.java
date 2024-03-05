package sec06;

public class CarEx {

	public static void main(String[] args) {

		Car c1 = new Car();
		System.out.println(c1.model);
		
		Car c2 = new Car("그랜저");
		System.out.println(c2.maxSpeed);
		
		Car c3 = new Car("그랜저", "레드");
		System.out.println();
		
		Car c4 = new Car();
		System.out.println(c4.maxSpeed);
		
		
		Car c5 = new Car("그랜저", "블루");
		
		System.out.println(c5.model + c5.color + c5.company);
		
		
		
	}

}
