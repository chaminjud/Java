package Sec15;

public class Singletone {
 
	// �ʵ�� private ���� ������ ���� ���� �ʵ� �������� �ʱ�ȭ
	private static Singletone singletone = new Singletone();
	// �����ڴ� private�� �ܺ� ������ ����
	private Singletone() {	
		
	} 
	
	
	// public ������ ���� �ż��带 ����� �ʵ带 ���
	public static Singletone getInstance() {
		return singletone;
	}
}
