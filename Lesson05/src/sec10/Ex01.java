package sec10;

public class Ex01 {

	public static void main(String[] args) {
		

		 int[][] array = { 
				 	{95, 86},
				 	{83, 92, 96},
				 	{78, 83, 93, 87, 88}
				  	};

	
			int sum = 0;
			for(int [] score : array) {
				for(int score2: score) {
					sum += score2;
				}
			}
			System.out.println("Á¡¼ö ÃÑÇÕ : " + sum);

			double avg = (double)sum/10;
			
			System.out.println("Æò±Õ :" + avg );
			
	}

}
