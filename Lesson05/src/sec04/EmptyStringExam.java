package sec04;

import java.util.Scanner;

public class EmptyStringExam {

	public static void main(String[] args) {
//		주민번호 7자리를 받아서 뒤에 한자리로 남,여 판별하시오
//		String hobby = "";
//		
//		if(hobby.equals("")) {
//			System.out.println("취미를 좀 찾으시는게 건강에 좋아요.");
//		}

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("주민번호 앞6자리");
//		
//		String num1 = sc.nextLine();
//		
//		System.out.println("주민번호 뒤1자리");
//		
//		String num2 = sc.nextLine();
//		
//		if(num2.equals("2")) {
//			System.out.println("여자입니다.");
//		}else {
//			System.out.println("남자입니다.");
//		}
		
		
//		주민번호 7자리를 받아서 뒤에 한자리로 남,여 판별하시오
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("주민번호 7자리");
			String gender = sc.nextLine();
		
			if(gender.length() == 7) {
				char s =gender.charAt(6);
				switch(s) {
					case '1' : case '3':
						System.out.println("남자");
					break;
					case '2' : case '4':
						System.out.println("여자");
					break;
				}
				break;
			}
		
		}
		System.out.println("종료");
	}
}
