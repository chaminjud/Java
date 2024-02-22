package Sec2;

public class CastingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) (longValue);
		System.out.println(intValue);
		
		double doubleValue = 3.1415926535897932384;
		float floatValue = (float) doubleValue;
		intValue = (int) doubleValue;
		
		System.out.println(floatValue);
		System.out.println(intValue);
		
		int i =125;
		if((i < Byte.MIN_VALUE)||(i >Byte.MAX_VALUE)) {
			System.out.println("byte타입으로 변환할 수 없습니다.");
		}else {
			byte b = (byte) i;
			System.out.println(b);
		}
		
		//데이터 손실
		int num1 =123456780;
		int num2 =123456780;
		
		int result = num1 - num2;
		System.out.println(result);
		
		float num3 = num2;
		num2 = (int) num3;
		result = num1 - num2;
		System.out.println(result);
	}
}
