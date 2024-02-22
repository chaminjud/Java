package Sec12;

public class Korean {

	//인스턴스 final 필드
	
	final String nation = "대한민국";
	final String ssn;
	
	String name;
	
	//생성자 선언 --> final 필드는 생성자로 초기화 가능하다.
	public Korean(String ssn) {
		this.ssn = ssn;
	}
	
	//메서드 초기화 --> final 필드는 메서드로 초기화 할 수 없다.
	void KoreanInit(String getName) {
		// this.ssn = getSsn;
		this.name = getName;
		System.out.println(this.ssn +"-" + this.name);
	}
}
