package Sec07_2im;

public class CarExam {

	public static void main(String[] args) {
		
		
		//Car ��ü ����
		
		Car myCar = new Car();
		
		//Tire ��ü ����
		myCar.tire = new Tire();
		myCar.run();
		
		//�ѱ� Ÿ�̾� ��ü ����
		myCar.tire = new HankookTire();
		myCar.run();
		
		//��ȣ Ÿ�̾� ��ü ����
		myCar.tire = new KumhoTire();
		myCar.run();
	}

}
