package sec01;

public class RefValExam {

	public static void main(String[] args) {

		int[] arr1; // 배열번수 arr1 서언
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] { 1, 2, 3 }; // 배열 {1, 2, 3} 생성 후 arr1에 대입
		arr2 = new int[] { 1, 2, 3 }; // 배열 {1, 2, 3} 생성 후 arr2에 대입 
		arr3 = arr2; // 배열변수 arr2를 arr3에 대입
		
		System.out.println(arr1 == arr2); //false
		System.out.println(arr2 == arr3); //true
		
	}

}
