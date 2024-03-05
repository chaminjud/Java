package Ch11.Sec01;

public class ExceptionHandlingExam2 {

	public static void main(String[] args) {
		
		
		try {
			//클래스 이름 찾는 함수
			Class.forName("java.lang.String");
			System.out.println("java.lang.String 클래스가 존재합니다.");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		System.out.println();
		
		try {
			//클래스 이름 찾는 함수
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 클래스가 존재합니다.");
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println();
	}



}
