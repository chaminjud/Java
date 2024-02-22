package sec08;

public class AdvancedForEx {

	public static void main(String[] args) {


		int[] scores = {95,71,35,69,77,88,15};
		
		//이 배열의 전체 합을 향상된 for문을 이용하여 구하라.
		
		int sum = 0;
		for(int score : scores) {
			//sum += score;
			sum = sum + score;
		}
		System.out.println("점수 총합 : " + sum);
		
		//평균을 구해라
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 병균 : " + avg);
	}

}
