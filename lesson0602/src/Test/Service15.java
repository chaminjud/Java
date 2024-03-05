package Test;

public class Service15 {

	//필드없음
	//생성자 기본값
	
	
	
	boolean login(String id, String pass) {
		if(id.equals("hong") && pass.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	
	
	void logout(String id) {
		System.out.println(id + "로그아웃 되었습니다");
	}
}
