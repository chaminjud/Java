package Test;

public class Service15Exam {

	public static void main(String[] args) {
		
		Service15 mem = new Service15();
		
		boolean result = mem.login("hong", "12345");
		
		if(result) {
			System.out.println("�α���");
			mem.logout("hong");
		}else {
			System.out.println("�ùٸ��� ����");
		}

	}

}
