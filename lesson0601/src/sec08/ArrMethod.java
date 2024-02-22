package sec08;

public class ArrMethod {
	//필드생략
	//생성자 기본
	
	//메소드
	int sum(int[] arrs){
		int sum = 0;
		
		for(int i = 0; i < arrs.length; i++) {
			sum += arrs[i];
		}
		
		return sum;
	}
	
	//가변길이 매개변수를 이용하는 메소드
	//사용법은 배열과 동일
	int sum2(int ... arrs) {
		int sum = 0;
		
		for(int i = 0; i < arrs.length; i++) {
			sum += arrs[i];
		}
		
		return sum;
	}
}
