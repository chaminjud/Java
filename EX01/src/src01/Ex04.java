package src01;

public class Ex04 {

	public static void main(String[] args) {
		
		//8. 99���� 1���� 9���� ����϶�.    

		for(int x =1; x <=99; x++) {
			System.out.println("\n\n % " + x + "�� %");
			for(int y = 1; y <= 9; y++) {
				System.out.println( x + "x" + y + "=" + (x*y));
			}
		}

		//8-1. 99���� 1���� 9���� ����϶�. 99�ܸ� ���    

//		for(int x =99; x <=99; x++) {
//			System.out.println("\n\n % " + x + "�� %");
//			for(int y = 1; y <= 9; y++) {
//				System.out.println( x + "x" + y + "=" + (x*y));
//			}
		
	}

}