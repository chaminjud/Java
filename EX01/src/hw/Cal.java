package hw;

public class Cal {
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
	
	int min(int x, int y) {
		int result2 = x-y;
		return result2;
	}
	
	double cro(int x, int y) {
		double result3 = (double)x * (double)y;
		return result3;
	}
	
	double divide(int x, int y) {
		double result4 = (double)x / (double)y;
		return result4;
	}
}