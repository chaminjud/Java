package Ch11.Sec04;

public class ReSourceOpenClose implements AutoCloseable{

	//�ʵ�
	private String name;
	
	//������
	public ReSourceOpenClose(String name){
		this.name = name;
		System.out.println(name + "����");
	}
	
	public String read1() {
		System.out.println(name + "�б�");
		return "100";
	}
	
	public String read2() {
		System.out.println(name + "�б�");
		return "ȫ�浿";
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(name + "�ݱ�");
		
	}
	
	
	
	
	



}
