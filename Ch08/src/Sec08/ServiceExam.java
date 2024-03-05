package Sec08;

public class ServiceExam {

	public static void main(String[] args) {
		
		//정적메서드
		Service.staticMethod1();
		System.out.println();
		Service.staticMethod2();
		System.out.println();
		
		Service se = new ServiceImp1();
		
		//default
		
		se.defaultMethod1();
		System.out.println();
		se.defaultMethod2();
		System.out.println();
		
		

		

	}

}
