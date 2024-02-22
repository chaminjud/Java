package sec10;

public class CalExam {

	public static void main(String[] args) {


		double result = 10 * 10 * Calculator.pi;
		System.out.println("반지름이 10인 원의 원주율은 " + result + " 입니다.");
		
		int result2 = Calculator.plus(10, 5);
		System.out.println(10 +  " + " + 5 + " = " + result2 +" 입니다.");
		int result3 = Calculator.minus(10, 5);
		System.out.println(10 +  " - " + 5 + " = " + result3 +" 입니다.");

		//10 * 5 multiply 사용해서 출력
		Calculator cal = new Calculator();
		int rs3 = cal.multiply(10, 5);
		
		System.out.println(rs3);
	}

}
