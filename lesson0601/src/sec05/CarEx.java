package sec05;

public class CarEx {

	public static void main(String[] args) {

		//Car 객체 생성
		Car myCar = new Car(); 
		
		System.out.println("모델명 : " + myCar.model);
		System.out.println("시동여부 : " + myCar.start);
		System.out.println("현재속도 : " + myCar.speed);
		
		//Car 객체의 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도는 " + myCar.speed);
		
		
	    Car myCar1 = new Car("버스");
	    Car myCar2 = new Car("버스",200);
	    Car myCar3 = new Car("버스",200,false);
	    
	    
	    
	    
	}

}
