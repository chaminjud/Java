package sec04;

public class SearchExam {

	public static void main(String[] args) {

		String str = "자바 프로그래밍";
		
		int rs = str.indexOf("프로그래밍"); // 인덱스번호 또는 -1을 리턴 하므로 int로 받아야함
		if(rs > -1 ) {
			System.out.println("프로그래밍 도서");
		}else {
			System.out.println("서양의 도시 자바관광 도서");
		}
	
		 boolean rs2 = str.contains("자바");
			if(rs2) {
				System.out.println("도서");
			}else {
				System.out.println("프로그래밍도서");
			}
	}

}
