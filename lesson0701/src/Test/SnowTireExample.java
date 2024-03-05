package Test;

public class SnowTireExample {

	public static void main(String[] args) {
		
		SnowTire t1 = new SnowTire();
		
		Tire t2 = t1;
		
		Tire t3 = new Tire();
		
		SnowTire t4 = (SnowTire) t3;
		
		t1.run();
		t2.run();

		
		
		
	}

}
