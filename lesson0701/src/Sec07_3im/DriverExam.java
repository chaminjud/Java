package Sec07_3im;

public class DriverExam {

	public static void main(String[] args) {
		
		// driver ��ü ����
		Driver driver = new Driver();
		
		//�Ű����� �̿��Ͽ� ������ ����
		
		Bus bus = new Bus();
		driver.drive(bus);
		
	    Taxi taxi = new Taxi();
	    driver.drive(taxi);
	    

	}

}
