package src01;

public class Ex04 {

	public static void main(String[] args) {
		
		//8. 99단을 1부터 9까지 출력하라.    

		for(int x =1; x <=99; x++) {
			System.out.println("\n\n % " + x + "단 %");
			for(int y = 1; y <= 9; y++) {
				System.out.println( x + "x" + y + "=" + (x*y));
			}
		}

		//8-1. 99단을 1부터 9까지 출력하라. 99단만 출력    

//		for(int x =99; x <=99; x++) {
//			System.out.println("\n\n % " + x + "단 %");
//			for(int y = 1; y <= 9; y++) {
//				System.out.println( x + "x" + y + "=" + (x*y));
//			}
		
	}

}
