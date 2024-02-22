package sec08;

public class ArrayStringEX {

	public static void main(String[] args) {

		String[] strArr = new String[3];
		strArr[0] = "Java"; //같은 객체의 주소참소
		strArr[1] = "Java"; //같은 객체의 주소참소
		strArr[2] = new String("Java"); // 새로운 주소에 생성
		
		System.out.println("0번 :" + strArr[0]);
		System.out.println("1번 :" + strArr[1]);
		System.out.println("2번 :" + strArr[2]);
		
		System.out.println(strArr[0]==strArr[1]); //true 같은 주소
		System.out.println(strArr[0]==strArr[2]); //false 문자열은 같지만 다른 주소에 생성 
		
		System.out.println(strArr[0].equals(strArr[2])); //문자열의 같음,다름은 equals()사용
		
		
	}

}
