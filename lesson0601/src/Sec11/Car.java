package Sec11;

public class Car {

	int speed;
	
	
	void run() {
	   simulate();	
	}
	
	  static void simulate() {
       Car sp = new Car();
       sp.speed = 200;
       
       
       System.out.println(sp.speed);
       
	}
	
	
}
