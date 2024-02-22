package Sec2;

public class Casting2Exam {

	public static void main(String[] args) {

		byte byteVal1 = 10;
		byte byteVal2 = 20;
		//byte rs = byteVal1 + byteVal2; 컴파일 에러 int로 변환해야함 int가 기본타입//
		int rs = byteVal1 + byteVal2;
		System.out.println(rs);
		
		char charVal1 = 'A';
		char charVal2 = 1;
		
		//char charVal3 = charVal1 + charVal2; // 컴파일 에러 정수의 계산식은 int로
		int charVal3 = charVal1 + charVal2;
		System.out.println("유니코드는 " + charVal3); //A 유니코드 = 65
		System.out.println("츌력 문자는 " + (char) charVal3); //출력 문자 =  ABCD 알파벳순
		
		int intVal3 = 10;
		int intVal4 = 4;
		int intVal5 = intVal3 / intVal4;
		System.out.println(intVal5);
		
		double doubleVal = intVal3 / (double) intVal4; // 강제변환 안시켜도 가능
		System.out.println(doubleVal);
	}

}
