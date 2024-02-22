package sec08;

public class ArrayCopyEx {

	public static void main(String[] args) {

		//���̰� 3�� �迭�� ����
		String[] oldStrArr = {"Java", "JavaScript", "mysql"};
		
		//���̰� 5�� �迭�� ���� ����
		String[] newStrArr = new String[5];
		
		//���̰� 3�� �迭�� �׸��� 5�� �迭�� ����
		System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length); //������ �ε���, ��ġ, �ٿ����� �ε���, ��ġ, 
		
		
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