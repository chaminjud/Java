package Sec04_2;

public class KF21_Airplane extends Airplane {

	
	//��� ����
	
	public static final int normal = 1;
	public static final int supersonic = 2;
	
	//���¼��� �ʵ�
	public int flymode = normal;

	@Override
	public void fly() {
		if(flymode == supersonic) {
			System.out.println("������ ������ �մϴ�.");
		}else {
			//�θ�Ŭ������ Airplane�� method fly() ȣ�⿡�� ���
			super.fly();
		}
		
	}
	
	
}
