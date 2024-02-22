package sec05;

public class ArrayCreateEx {

	public static void main(String[] args) {

		//배열 선언과 동시에 생성
//		String[] season = {"Spring","Summer","Fall","Winter"};
//		
//		season[1] = "여름";
//		for(int i=0; i<season.length; i++){
//			System.out.println(season[i]);
//		}
		
		int[] scores = { 83, 95, 75};
		int sum = 0;
		//for문을 이용하여 총합과 평균을 구하라.
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 :" + sum);
		double avg = (double) sum / scores.length;
		System.out.println("평균 :" + avg);
		
//		타입[] 변수;
//		변수 = {값0, 값1, 값2, 값3}; 컴파일 에러
//		변수 = new 타입[] {값0, 값1, 값2, 값3}; 정상
//		
//		String[] members = null;
//		members = new String[] {"회원1", "회원2", "회원3"};
//		
//		void 함수이름(변수타입 변수이름) {
//			System.out.println();
//		}
//		
//		int void 함수이름(변수타입 변수이름) {
//		System.out.println();
//		return;
//		
//		int[] scores = {1,2,3,4,5};
//		void sum(int[]sc) {
//			?????
//		}
//		배열 리터럴을 직접 매개변수에 넣을 때는 new 해야 한다.
//		void sum(new int[] {1,2,3,4,5}) {
//			?????
//		}
		
		}

}
