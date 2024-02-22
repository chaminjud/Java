package sec06;

public class Exam {

	public static void main(String[] args) {
		
		
		//문자 A를 변수 charCode에 담아 charCode가 65~90사이에 있으면 "charCode는 대문자 입니다." 를 출력 하라
		
		//char charCode = 'A';
		int charCode = 'A';
		
		if((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자 입니다.");
		}
				

		//charCode가 97 과 122 사이에 있으면 charCode는 소문자 입니다. 그렇지 않으면 소문자가 아닙니다. 를 출력하라
		
		if((charCode >= 97) & (charCode <= 122)) {
			System.out.println("대문자 입니다.");
		}else {
			System.out.println("소문자가 아닙니다.");
		}
				
		//charCode가 48 과 57 사이에 있으면 charCode는 숫자 입니다. 그렇지 않으면 숫자가 아닙니다. 를 출력하라
		
		if((charCode >= 48) & (charCode <= 57)) {
			System.out.println("숫자 입니다..");
		}else {
			System.out.println("숫자가 아닙니다.");
		}
	}

}
