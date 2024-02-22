package Class01;

public class SingleOpExam02 {

	public static void main(String[] args) {

		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		int result1 = v1 +v2;
		System.out.println("v1 + v2 = " + result1);
		
		long result2 = v1 + v2 - v4;
		System.out.println("v1 + v2 - v4 = " + result2);
		
		double result3 = (double) v1 / v2;
		//double result5 = 15.0 / 20; 
		
		System.out.println("v1 / v2 = " + result3);
		
		int result4 = v1 % v2;
		System.out.println("v1 % v2 = " + result4);
	}

}
