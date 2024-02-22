package Exam14;

public class Car {

	//필드선언
	
	private int speed;
	private boolean stop;
	
	//speed의 getter 와 setter선언
	
	//필드는 다른 곳에서 사용 불가능 하지만 메서드는 사용 가능
	public int getSpeed(){
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	
	
	//stop의 getter 와 setter
	// boolean 타입을 get할때는 is를 사용한다
	public boolean isStop() {
		return stop;
	}
	
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) {
			this.speed = 0;
		}
	}
}
