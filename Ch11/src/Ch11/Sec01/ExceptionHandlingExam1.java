package Ch11.Sec01;

public class ExceptionHandlingExam1 {

	//�ż���
	public static void printLength(String data) {
		try {
		int rs = data.length();
		System.out.println("���� �� :" + rs);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}finally {
			System.out.println("���α׷��� ����Ǿ����ϴ�.");
		}
	}
	
	public static void main(String[] args) {
		
	  
		printLength("�ڹ��� ����ó��");
		System.out.println();
		printLength(null);
		
		

	}

}
