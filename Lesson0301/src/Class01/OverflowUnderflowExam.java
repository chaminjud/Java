package Class01;

public class OverflowUnderflowExam {

	public static void main(String[] args) {

		byte var1 = 125;
		for(int i = 0; i <5; i++) {
			var1++;
			System.out.println("var1 : " + var1);
		}
		System.out.println("----------------");
		
		byte var2 = -125;
		for(int i = 0; i < 5; i++) {
			var2--;
			System.out.println("var2 : " + var2);
		}
		
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		
		long z1 = (long)x * y;
		System.out.println(z1);
	}

}
