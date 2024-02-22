package sec08;

public class ArrExam {

	public static void main(String[] args) {


		ArrMethod arrs = new ArrMethod();
		
		int[] nums = {1, 2 , 3, 4, 5, 6, 7, 8, 9, 10};
		int rs = arrs.sum(new int[] {1, 2 , 3, 4, 5, 6, 7, 8, 9, 10});
//		int rs = arrs.sum(nums); 위에 숫자를 직접 넣으려면 new int[] 사용
		System.out.println("1부터 10까지의 합은 : " + rs);
		
		int rs2 = arrs.sum2(1,2,3,4,5,6,7,8,9,10);
		System.out.println("1부터 10까지 합은 : " + rs2);
	}		

}
