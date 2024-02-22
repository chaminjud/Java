package sec06;

public class AssignExam {

	public static void main(String[] args) {

		int result = 0;
		result += 10;
		System.out.println(result);
		
		result -= 5;
		System.out.println(result);
		
		result *= 3;
		System.out.println(result);
		
		result /= 5;
		System.out.println(result);
		
		result %= 3;
		System.out.println(result);
		
		int score = 85;
		char grade = (score >= 90) ? 'A' : ((score >= 80)? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
	}

}
