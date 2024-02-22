package sec08;

public class ArrayCopyEx {

	public static void main(String[] args) {

		//길이가 3인 배열을 만듬
		String[] oldStrArr = {"Java", "JavaScript", "mysql"};
		
		//길이가 5인 배열을 새로 생성
		String[] newStrArr = new String[5];
		
		//길이가 3인 배열의 항목을 5인 배열에 복사
		System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length); //복사할 인덱스, 위치, 붙여넣을 인덱스, 위치, 
		
		
		for(int i = 0; i < newStrArr.length; i++) {
			System.out.println(newStrArr[i] + ", ");
		}
		
		System.out.println();
		System.out.println("++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++");
		
		for(String str : newStrArr) {
			System.out.println(str + ", ");
		}
	}

}
