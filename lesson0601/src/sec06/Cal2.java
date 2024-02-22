package sec06;

public class Cal2 {

	public static void main(String[] args) {

		Calculator2 cal = new Calculator2();
		
		//리턴값이 없는 메소드를 출력 .은 하위에 내용을 불러올때 사용
		cal.powerOn(); //외부 메소드여서 객체를 받아서 사용
		
		int rs = cal.plus(143, 145);
		System.out.println("143 + 145 = " + rs);
		
		double rs2 = cal.divide(120, 15);
		System.out.println("120 / 15 = " + rs2);
		
		cal.powerOff();
		
		cal.autoCalculator(111, 222);
	}

}
