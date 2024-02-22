package sec02;

public class FloatCounterExam {

	public static void main(String[] args) {

		for(float x = 0.1f; x <= 1.0f; x+=0.1f) {
			System.out.println(x);
		}
		
		
		for(double x = 0.1; x <= 1.0; x+=0.1) {
			System.out.println(x);
		}
		
		for(int x =2; x <=9; x++) {
			System.out.println("\n\n % " + x + "´Ü %");
			for(int y = 1; y <= 9; y++) {
				System.out.println( x + "x" + y + "=" + (x*y));
			}
		}
		
		int x = 2;
		int y = 1;
		while(x <= 9) {
			System.out.println("\n\n % " + x + "´Ü %");
			while(y <= 9) {
				System.out.println(x + "x" + y + "=" + (x*y));
				y++;
			}
			y =1;
			x++;
		}
	}

}
