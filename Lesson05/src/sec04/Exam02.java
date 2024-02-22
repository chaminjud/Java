package sec04;


public class Exam02 {
	public static void main(String[] args) {
		
//		 자바 문자열은 불변입니다. 자바 문자열은 String입니다. 자바를 java로 변경
//		 String num1 = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
//
//		 System.out.println(num1);
//		 
//		 String num2 = num1.replace("자바","java");
//		 
//		 System.out.println(num2);
		
//		1.Hello,World! 에서 World만 추출 하시오.
//		2.Hello 만 추출 하시오.
		
		String num1 = "Hello,World!";
		
		System.out.println(num1);
		
		String num2 = num1.substring(6,11);
		
		System.out.println(num2);
		
		String num3 = num1.substring(0,5);
		
		System.out.println(num3);
		

	}
}