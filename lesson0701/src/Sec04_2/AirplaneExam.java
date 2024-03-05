package Sec04_2;

public class AirplaneExam {

	public static void main(String[] args) {
		
		KF21_Airplane air = new KF21_Airplane();
		
		air.takeOff();
		air.fly();
		air.flymode = air.supersonic;
		air.fly();
		air.flymode = air.normal;
		air.fly();
		air.land();

	}

}
