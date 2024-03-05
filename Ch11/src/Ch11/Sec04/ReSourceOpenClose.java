package Ch11.Sec04;

public class ReSourceOpenClose implements AutoCloseable{

	//필드
	private String name;
	
	//생성자
	public ReSourceOpenClose(String name){
		this.name = name;
		System.out.println(name + "열기");
	}
	
	public String read1() {
		System.out.println(name + "읽기");
		return "100";
	}
	
	public String read2() {
		System.out.println(name + "읽기");
		return "홍길동";
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(name + "닫기");
		
	}
	
	
	
	
	



}
