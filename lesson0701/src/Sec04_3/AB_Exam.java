package Sec04_3;

public class AB_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A aa = new A(); //부모 클래스연결
		
		aa.method1();  // 부모인자인 A클래스에서 가져옴
		aa.method2();  // 부모인자인 A클래스에서 가져옴
		
		B bb = new B(); // 자식클래스 연결
 		
		bb.method1(); 
		// super.메소드이름(); 을 사용했기때문에 부모인자의 method1()을 가져옴
		bb.method2();  
		// ** 변수값에 int정의가 없기때문에 재정의 되지않고 부모인자인 A클래스의 메소드를 상속받아 가져옴
		bb.method2(3);
		// 매개변수의 int값을 정의해줬기 떄문에 자식인자인 B클래스에서 가져옴
		
	}

}
