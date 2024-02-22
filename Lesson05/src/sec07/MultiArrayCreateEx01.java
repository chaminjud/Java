package sec07;

public class MultiArrayCreateEx01 {

	public static void main(String[] args) {


		//2차원 배열 생성 = [][]
		int[][] scores = {
				{15, 25, 35},
				{50, 70, 30, 40, 90}
		};
		
		//배열의 길이
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		
		//첫 번째 반의 세번째 학생 점수는?
		System.out.println(scores[0][2]);
		
		//두 번재 반의 두 번째 학생 점수는?
		System.out.println(scores[1][1]);
		
		//첫 번째 반의 평균 점수는?
		int fclassSum = 0;
		for(int i=0; i<scores[0].length; i++) {
			fclassSum += scores[0][i];
		}
		double fclassAvg = (double) fclassSum / scores[0].length;
		System.out.println(fclassAvg);
		
		//두 번째 반의 평균 점수는?
		int sclassSum = 0;
		for(int i=0; i<scores[1].length; i++) {
			sclassSum += scores[1][i];
		}
		double sclassAvg = (double) sclassSum / scores[1].length;
		System.out.println(sclassAvg);
		
		//전체 평균 점수는?
		int totalStudent = 0;
		int totalSum = 0;
		for(int i = 0; i<scores.length; i++) {
			totalStudent += scores[i].length;
			for(int j = 0; j<scores[i].length; j++) {
				totalSum += scores[i][j];
			}
		}
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println(totalAvg);
		}


	}

