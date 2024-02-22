package sec06;

public class Calculator2 {
	//필드 -- 생량
	//생성자 -- 기본생성자
	//method
	
	//리턴이 없는 메소드를 선언
	void powerOn(){
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
	//두 매개변수를 더하는 메소드
	int plus(int x , int y) {
		int result = x + y;
		return result;
	}
	
	//두 정수를 나누는 메소드
	double divide(int x , int y) {
		double result =(double) x / y;
		return result;
	}
	
	void autoCalculator(int x , int y) {
		powerOn(); //내부 메소드를 사용해서 그냥 사용가능
		int rs = plus(x , y);
		double rs2 = divide(x , y ); 
		System.out.println(x + "+" + y + "=" + rs);
		System.out.println(x + "+" + y + "=" + rs2);
		powerOff();

	}
}
