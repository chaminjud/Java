package Sec11;

public class TelevisionExam {

	public static void main(String[] args) {
		
		
		//정적 메소드를 사용하여 new생성자 없이 사용한 예시		
		System.out.println(Television.info);

		Television.method2();
		
		
		
		//인스턴스 필드 및 메서드를 사용한 예시
		Television tv = new Television();
		
		System.out.println(tv.pay);
		tv.method1(5000000);
	}

}
