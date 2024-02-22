package sec02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int me = in.nextInt();
		int dice = (int)((Math.random()*6)+1);
		if(me == dice) {
			System.out.println("같습니다.");
		}else if (me < dice) {
			System.out.println("주사위가 더 높습니다.");
		}else {
			System.out.println("주사위가 더 낮습니다.");
		}
		
	}

}


