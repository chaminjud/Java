package Sec12;

public class Korean {

	//�ν��Ͻ� final �ʵ�
	
	final String nation = "���ѹα�";
	final String ssn;
	
	String name;
	
	//������ ���� --> final �ʵ�� �����ڷ� �ʱ�ȭ �����ϴ�.
	public Korean(String ssn) {
		this.ssn = ssn;
	}
	
	//�޼��� �ʱ�ȭ --> final �ʵ�� �޼���� �ʱ�ȭ �� �� ����.
	void KoreanInit(String getName) {
		// this.ssn = getSsn;
		this.name = getName;
		System.out.println(this.ssn +"-" + this.name);
	}
}
