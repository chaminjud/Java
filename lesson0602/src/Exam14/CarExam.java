package Exam14;

public class CarExam {

	public static void main(String[] args) {
		
		
		Car myCar = new Car();
		
		//스피드는 음수값을 가질 수 없으므로 0이 나오게 함수를 작성해놓음 
		myCar.setSpeed(-10);
		System.out.println("현재속도 :" + myCar.getSpeed());
		
		myCar.setSpeed(100);
		System.out.println("현재속도 :" + myCar.getSpeed());
		
		//멈춤 
	
		
		// 
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재속도 :" + myCar.getSpeed());
	}

}
