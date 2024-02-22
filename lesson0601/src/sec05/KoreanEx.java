package sec05;

public class KoreanEx {

	public static void main(String[] args) {

		Korean s1 = new Korean("안철수","215455-1212121",65);
		Korean s2 = new Korean("이영자","151214-2122121",45);
		
		System.out.println("국적 : " + s1.nation);
		System.out.println(s1.name + ", " + s1.age + "세, " + s1.ssn);
		
		System.out.println("국적 : " + s2.nation);
		System.out.println(s2.name + ", " + s2.age + "세, " + s2.ssn);
	}

}
