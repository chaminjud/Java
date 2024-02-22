package Class01;

public class AccExam {

	public static void main(String[] args) {
		/*
		 * 사과가 1있다. 이 사과를 10조각으로 나눈다.
		 * 한 조각은 0.1
		 * 7조각을 먹고 남은 조각은?
		 * 0.3
		 */
		int apple = 1;
		double onePeace = 0.1;
		int number = 7;
		
		double resultApple = apple - number*onePeace;
		System.out.println("사과 한개에서 남은 양은 " + resultApple + "입니다");
		
		int totalPeace = apple * 10;
		int resultApple2 = totalPeace - number;
		System.out.println("사과 10조각 중에 남은 조각은 " + resultApple2);
		System.out.println("사과 한 개에서 남은 양은 " + resultApple2/10.0);
		
	}

}
