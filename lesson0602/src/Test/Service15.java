package Test;

public class Service15 {

	//�ʵ����
	//������ �⺻��
	
	
	
	boolean login(String id, String pass) {
		if(id.equals("hong") && pass.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	
	
	void logout(String id) {
		System.out.println(id + "�α׾ƿ� �Ǿ����ϴ�");
	}
}
