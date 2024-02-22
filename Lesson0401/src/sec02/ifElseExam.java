package sec02;

import java.util.Scanner;

public class ifElseExam {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("번호를 입력하세요.");
		int num=sc.nextInt();
		if(num > 90) {
			System.out.println("A학점을 받으셨습니다.");
		}else if(num > 80){
			System.out.println("B학점을 받으셨습니다.");
		}else if(num > 70){
			System.out.println("C학점을 받으셨습니다.");
		}else if(num > 60){
			System.out.println("D학점을 받으셨습니다.");
		}else {
			System.out.println("F학점을 받으셨습니다.");
		}
	}

}
