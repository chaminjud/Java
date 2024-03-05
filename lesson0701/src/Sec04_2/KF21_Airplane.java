package Sec04_2;

public class KF21_Airplane extends Airplane {

	
	//상수 선언
	
	public static final int normal = 1;
	public static final int supersonic = 2;
	
	//상태선언 필드
	public int flymode = normal;

	@Override
	public void fly() {
		if(flymode == supersonic) {
			System.out.println("초음속 비행을 합니다.");
		}else {
			//부모클래스의 Airplane의 method fly() 호출에서 사용
			super.fly();
		}
		
	}
	
	
}
