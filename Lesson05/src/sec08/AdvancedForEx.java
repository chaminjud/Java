package sec08;

public class AdvancedForEx {

	public static void main(String[] args) {


		int[] scores = {95,71,35,69,77,88,15};
		
		//�� �迭�� ��ü ���� ���� for���� �̿��Ͽ� ���϶�.
		
		int sum = 0;
		for(int score : scores) {
			//sum += score;
			sum = sum + score;
		}
		System.out.println("���� ���� : " + sum);
		
		//����� ���ض�
		
		double avg = (double) sum / scores.length;
		System.out.println("���� ���� : " + avg);
	}

}