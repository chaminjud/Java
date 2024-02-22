package Sec3;

public class ValScopeExam {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1 >10) {
			int v2 = v1 - 10;
		}
		//int v3 = v1 + v2 +5; //v2 변수 사용 불가로 인해 컴파일 에러
		
		
		//   %s(문자)		%d(숫자) 표시
		
		System.out.println("1번 텍스트");
		System.out.print("2번 텍스트");
		
		System.out.printf("이름 : $s", "홍 길동");
		System.out.printf("나이 : %d", 25);
		
		System.out.printf("이름 : %s, 나이 : %d", "홍 길동", 25);
	}

}
