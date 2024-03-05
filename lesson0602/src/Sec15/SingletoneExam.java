package Sec15;

public class SingletoneExam {

	public static void main(String[] args) {
		
		
		// Singletone ton1 = new Singletone(); Singletone클래스는 private이므로 외부에서 객체화 시킬 수 없다
		
		// 정적 메서드를 호출해서 Singletone 객체를 얻음
		// 싱글톤은 같은 객체다 같은 힙영역에 주소를 참조하고 있기 때문이다.
		Singletone obj1 = Singletone.getInstance();
		Singletone obj2 = Singletone.getInstance();
		
		
	
	
	
		if(obj1 == obj2) {
			System.out.println("같은 Singletone 객체 입니다.");
		}else {
			System.out.println("다른 Singletone 객체 입니다.");
		}
    }

}
