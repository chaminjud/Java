package sec04;

public class StringExam {

	public static void main(String[] args) {

		
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		String name3 = new String("홍길동");  //새로운 영역에 생성 주소가 다름
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		System.out.println(name3 == name2);
		
		System.out.println(name1.equals(name3)); // "홍길동"이라는 문자열은 같아서 equals 연산을 사용
		
		
	}

}
