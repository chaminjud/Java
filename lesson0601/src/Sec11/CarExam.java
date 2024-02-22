package Sec11;

public class CarExam {
	
	    //인스턴스 필드 선언
		int speed;
		//인스턴스 메서드 선언
		void run() {
			System.out.println(speed +"으로 달립니다.");
		}
		
		static void sumulate() {
			//객체생성
			Car myCar = new Car();
			
			//인스턴트 멤버 사용
			myCar.speed = 200;
			myCar.run();
		}

	public static void main(String[] args) {
	     
		sumulate();
		
		
		Car myCar = new Car();
		myCar.speed = 50;
		myCar.run();
	}

}
