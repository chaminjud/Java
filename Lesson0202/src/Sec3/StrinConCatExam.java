package Sec3;

public class StrinConCatExam {

	public static void main(String[] args) {

		//숫자연산
		int res1 = 10 + 2 + 8; //20
		System.out.println(res1);
		
		//결합 연산
		String res2 = 10 + 2 + "8"; //128
		System.out.println(res2);
		
		int resInt = Integer.parseInt(res2); //148
		int resRes = res1 + resInt;
		System.out.println(resRes);
		
		String res3 = 10 + "2" + 8; //1028
		System.out.println(res3);
		
		String res4 = "10" + 2 + 8; //1028
		System.out.println(res4); 
		
		String res5 = "10" + (2 + 8); //1010
		System.out.println(res5);
		
		
	}

}
