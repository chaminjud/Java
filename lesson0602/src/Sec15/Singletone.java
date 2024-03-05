package Sec15;

public class Singletone {
 
	// 필드는 private 접근 권한을 갖는 정적 필드 선언으로 초기화
	private static Singletone singletone = new Singletone();
	// 생성자는 private로 외부 접근을 막음
	private Singletone() {	
		
	} 
	
	
	// public 권한을 갖는 매서드를 만들어 필드를 사용
	public static Singletone getInstance() {
		return singletone;
	}
}
