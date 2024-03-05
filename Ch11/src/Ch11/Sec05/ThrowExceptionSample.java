package Ch11.Sec05;

public class ThrowExceptionSample {

	
	public static void main(String[] agrs) {

		//���� �������� ��� ����ó���� �� �־�� ��
	  	 try {
			  method1();
		  }catch(ClassNotFoundException e) {
			  e.printStackTrace();
		  }
	  	 
	  	 //����ó���� �Ǿ� �־ �׳� ��밡��
	  	 method2();
	}
	
	
	//������ ���� �������� ���ѱ�
	public static void method1() throws ClassNotFoundException {
	
		 Class.forName("java.lang.String2");
	}
	
	
	// �޼��� ������ ���� ����ó���� ����
	public static void method2() {
		try {
			Class.forName("java.lang.Integer2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


	
