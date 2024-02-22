package sec06;

public class Calculator {

	//필드 없음
	//생성자 기본
	
	//메소드
	
	//리턴이 없는 메소드 선언 sysout앞에 return이 없는 경우 void 선언
	void powerOn(){
		System.out.println("전원을 킨다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끈다");
	}
	
	int add(int x, int y) {
		int result = x+y;
		return result;
	}
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
}
