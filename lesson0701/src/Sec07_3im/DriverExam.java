package Sec07_3im;

public class DriverExam {

	public static void main(String[] args) {
		
		// driver 객체 생성
		Driver driver = new Driver();
		
		//매개값을 이용하여 다형성 구현
		
		Bus bus = new Bus();
		driver.drive(bus);
		
	    Taxi taxi = new Taxi();
	    driver.drive(taxi);
	    

	}

}
