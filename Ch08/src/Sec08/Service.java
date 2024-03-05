package Sec08;

public interface Service {

	//default �޼��� �������̽����� ������ü�� ���� �� �ִ�.
	default void defaultMethod1() {
		System.out.println("defaultMethod1 ���� �ڵ�");
		defaultCommon();
		staticCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod1 ���� �ڵ�");
		defaultCommon();
		
	}
	
	
	// private �޼���
	// ������ ����� �� ���� ������ default�޼��忡�� ����������
	private void defaultCommon() {
		System.out.println("defaultMethod �ߺ� �ڵ�A");
		System.out.println("defaultMethod �ߺ� �ڵ�B");
	}
	
	// ���� �޼���
	static void staticMethod1() {
		System.out.println("staticMethod1 ���� �ڵ�");
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod2 ���� �ڵ�");
		staticCommon();
	  //defaultCommon();
	}
	
	// private ���� �޼���
	
    private static void staticCommon() {
    	System.out.println("staticMethod �ߺ��ڵ�C");
    	System.out.println("staticMethod �ߺ��ڵ�D");
    }
}
