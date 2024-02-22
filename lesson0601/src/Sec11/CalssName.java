package Sec11;

public class CalssName {

	
	//인스턴스 멤버
	int field1; // 필드
	void method() {} //메서드
	
	//정적 멤버
	static int field2; // 정적필드
	static void method2() { // 정적 메서드
		
	}
	
	//정적 블록
	static {
		// 정적블록 내에서 인스턴스 멤버를 사용하지 못하기 때문
		// field1 =10; 컴파일 에러
	    // method(); 컴파일 에러
	    field2 = 10;
	    method2();
	}
	
	
	//정적 메서드
	static void method3() {
		//this.field1 = 10; this는 사용 불가
		//this.method1(); // 메서드 역시 사용 불가능
		field2 = 10;
		method2();
	}
}
