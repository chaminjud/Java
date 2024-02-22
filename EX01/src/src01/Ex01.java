package src01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		//5.두 숫자 74와 36의 합을 출력하라.

		System.out.println("숫자를 입력하세요");

		int num1 =sc.nextInt();
		
		System.out.println("숫자를 입력하세요");
		
		int num2 = sc.nextInt();
		
		int num3 = num1 + num2;
		System.out.println(num3);
		
		

		
	}

}
