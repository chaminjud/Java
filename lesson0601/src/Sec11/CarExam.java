package Sec11;

public class CarExam {
	
	    //�ν��Ͻ� �ʵ� ����
		int speed;
		//�ν��Ͻ� �޼��� ����
		void run() {
			System.out.println(speed +"���� �޸��ϴ�.");
		}
		
		static void sumulate() {
			//��ü����
			Car myCar = new Car();
			
			//�ν���Ʈ ��� ���
			myCar.speed = 200;
			myCar.run();
		}

	public static void main(String[] args) {
	     
		sumulate();
		
		
		Car myCar = new Car();
		myCar.speed = 50;
		myCar.run();
	}

}
