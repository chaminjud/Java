package Test;

public class Parent {

	public String nation;
	
	public Parent() {
		//this() �ٸ� �����ڸ� �������°��̴�
		//���⼭�� �ؿ� ������ String�� �Ű������� ���� ������
		// �� this�� "���ѹα�"�̶�� �Ű������� ȣ��ȴ�.
		this("���ѹα�");
		System.out.println("Parent() call");
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation call");
	}
}
