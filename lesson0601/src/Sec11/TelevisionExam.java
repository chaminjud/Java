package Sec11;

public class TelevisionExam {

	public static void main(String[] args) {
		
		
		//���� �޼ҵ带 ����Ͽ� new������ ���� ����� ����		
		System.out.println(Television.info);

		Television.method2();
		
		
		
		//�ν��Ͻ� �ʵ� �� �޼��带 ����� ����
		Television tv = new Television();
		
		System.out.println(tv.pay);
		tv.method1(5000000);
	}

}
