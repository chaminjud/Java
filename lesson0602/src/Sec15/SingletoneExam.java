package Sec15;

public class SingletoneExam {

	public static void main(String[] args) {
		
		
		// Singletone ton1 = new Singletone(); SingletoneŬ������ private�̹Ƿ� �ܺο��� ��üȭ ��ų �� ����
		
		// ���� �޼��带 ȣ���ؼ� Singletone ��ü�� ����
		// �̱����� ���� ��ü�� ���� �������� �ּҸ� �����ϰ� �ֱ� �����̴�.
		Singletone obj1 = Singletone.getInstance();
		Singletone obj2 = Singletone.getInstance();
		
		
	
	
	
		if(obj1 == obj2) {
			System.out.println("���� Singletone ��ü �Դϴ�.");
		}else {
			System.out.println("�ٸ� Singletone ��ü �Դϴ�.");
		}
    }

}
