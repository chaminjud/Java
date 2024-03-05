package Ch11.Sec05;

public class ThrowExceptionSample {

	
	public static void main(String[] agrs) {

		//실행 영역에서 대신 에러처리를 해 주어야 함
	  	 try {
			  method1();
		  }catch(ClassNotFoundException e) {
			  e.printStackTrace();
		  }
	  	 
	  	 //에러처리가 되어 있어서 그냥 사용가능
	  	 method2();
	}
	
	
	//에러를 실행 영역으로 떠넘김
	public static void method1() throws ClassNotFoundException {
	
		 Class.forName("java.lang.String2");
	}
	
	
	// 메서드 본인이 직접 예외처리를 실행
	public static void method2() {
		try {
			Class.forName("java.lang.Integer2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


	
