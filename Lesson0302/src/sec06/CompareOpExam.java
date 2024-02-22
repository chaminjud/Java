package sec06;

public class CompareOpExam {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 10;
		boolean rs1 = (num1 == num2);
		boolean rs2 = (num1 != num2);
		boolean rs3 = (num1 <= num2);
		System.out.println("rs1 :" +rs1);
		System.out.println("rs2 :" +rs2);
		System.out.println("rs3 :" +rs3);
		

		//char A와 char B를 변수에 담아 A < B 인지 비교하시오
		char char1 = 'A';
		char char2 = 'B';
		boolean rs4 = (char1 < char2); // 65 < 66
		System.out.println("rs4 :" + rs4);
		
		//1과 1.0을 변수에 담아 같은지 비교 하시오.
		int num3 =1;
		double num4 = 1.0;
		boolean rs5 = (num3 == num4);
		System.out.println("rs5 :" + rs5);
		
		//0.1f 0.1을 변수에 담아 같은지 비교 하시오. 만약 다르다면 타입을 맞추어 비교 하시오
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean rs6 = (num5 == num6);
		boolean rs7 = (num5 ==(float)num6);
		System.out.println("rs6 :" + rs6);
		System.out.println("rs7 :" + rs7);
		
		String str1 = "자바";
		String str2 = "java";
		boolean rs8 = (str1 == str2);
		boolean rs9 = (str1.equals(str2));
		boolean rs10 = (!str1.equals(str2));
		System.out.println("rs8 :" + rs8);
		System.out.println("rs9 :" + rs9);
		System.out.println("rs10 :" + rs10);
		
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		String strVar3 = new String("홍길동");

		boolean st1 = strVar1 ==strVar2;
		boolean st2 = strVar1 ==strVar3;
		boolean st3 = strVar1.equals(strVar3);

		System.out.println("st1 :" +strVar1 + st1);
		System.out.println("st2 :" +strVar3 + st2);
		System.out.println("st3 :" +strVar3 + st3);



		
		// System.out.println("rs9 :" + rs9);
		//System.out.println("rs10 :" + rs10);


	}

}
