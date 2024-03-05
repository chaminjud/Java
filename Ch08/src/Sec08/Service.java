package Sec08;

public interface Service {

	//default 메서드 인터페이스지만 구현객체를 가질 수 있다.
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon();
		staticCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon();
		
	}
	
	
	// private 메서드
	// 스스로 사용할 수 없기 때문에 default메서드에서 사용해줘야함
	private void defaultCommon() {
		System.out.println("defaultMethod 중복 코드A");
		System.out.println("defaultMethod 중복 코드B");
	}
	
	// 정적 메서드
	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드");
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");
		staticCommon();
	  //defaultCommon();
	}
	
	// private 정적 메서드
	
    private static void staticCommon() {
    	System.out.println("staticMethod 중복코드C");
    	System.out.println("staticMethod 중복코드D");
    }
}
