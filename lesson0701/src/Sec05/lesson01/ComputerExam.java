package Sec05.lesson01;

public class ComputerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r = 10;
		
		Calculator cal = new Calculator();
		System.out.println("�� ���� :" + cal.areaCircle(r));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("�� ���� :" + com.areaCircle(r));
	}

}
