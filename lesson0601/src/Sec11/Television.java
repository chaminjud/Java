package Sec11;

public class Television {
	//�ν��Ͻ� �ʵ�� new��� �����ڸ� ���� �Ŀ� ��� �����ϰ�
	//�����ʵ�� ������ ���� ��� �����ϴ�.

	//�ν��Ͻ� �ʵ�
	int pay = 20000000;
	String color;
	

	// ���� �ʵ�(static) , �����ʵ�� �Ϲ������� �ٷ� �ʱ�ȭ�� �Ѵ�.
	static String company = "LG";
	static String model = "OLED";
	static String info;
	
	//���� ���� �����ϴ� ��� static{}
	static {
		info = company + "-" + model;
	}
	
	//���� �޼���
	static void method2() {
		System.out.println(info);
	}
	
	
	//�ν��Ͻ� �޼���
	void method1(int getPay) {
		this.pay = getPay;
		this.color= "����";
		System.out.println(this.pay + "," + this.color + info);
	}
	//�ν��Ͻ� �޼��忡�� �����ʵ带 ����� �� �ְ� ����Ҷ��� this�� ����� �ʿ䰡 ����
	//�ν��Ͻ� �޼��� ��ü�� ���� �Ǿ������ ����� �� �ֱ� ������ 
	//�����޼��� ���� �μ��Ͻ� �ʵ带 ����� �� ����
	
	//���
	//���� ��� �ȿ��� �ν��Ͻ� ����� ����� �� ����.
	//�ν��Ͻ� ��� �ȿ��� ���� ����� ����� �� �ִ�.
	
	
	
}
