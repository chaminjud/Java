package Sec03;

public class AnimalExam {

	public static void main(String[] args) {
		
		Animal ani; // �������̽� ��ü�� �����ڸ� ����� �� �ʿ� ���� ��� �����ϴ� 
		            // ���� int a; �̷� ������ ��������
		
		ani = new Dog();
		//������ ������ animal�� ����(implements)�� Ŭ������
		//������ ���� �Ŀ� ��� �����ϴ�. �̶� new Dog()�� Ÿ���� AnimalŸ������ �ڵ� ��ȯ�ȴ�/
		
		ani.cry();
		
		ani = new Cat();
		
		ani.cry();

	}

}
