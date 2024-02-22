package Class01;

import java.util.Scanner;

public class InfinityAndNanExam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("x값의 숫자를 입력하세요.");
		//String strX = sc.nextLine():
		//int X = Integer.parseInt(strX);
		int x = sc.nextInt();
		
		System.out.println("y값의 숫자를 입력하세요.");
		double y = sc.nextDouble();
		
		double z = x / y;
		
		
		//int x = 5;
		//double y = 0.0;
		//double z = x / y;
		//System.out.println(z);
		//System.out.println(z + 10000);
		
		//예외처리
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값을 계산할 수 없음.");
		}else {
			System.out.println( z + 2 );
		}
		
		sc.close();
	}

}
