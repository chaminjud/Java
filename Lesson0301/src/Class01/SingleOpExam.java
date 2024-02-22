package Class01;

public class SingleOpExam {

	public static void main(String[] args) {

		//int x = -100;
		//x = -x;
		//System.out.println("x : " + x);
		
		//byte b = 100;
		//byte y = -b; -부호도 연산이기 때문에 결과는 int
		//int y = -b;
		//System.out.println("y : " + y);
		
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x = " + x);
		
		System.out.println("-------------");
		y--;
		--y;
		System.out.println("y = " + y);
		System.out.println("-------------");

		z = x++;
		System.out.println("z = " +z);
		System.out.println("x = " +x);
		System.out.println("--------------");
		
		z = ++x + y++;
		/*
		 * 1. x에 1이 더해짐
		 * 2. 1이 더해진 x와 y가 더해짐
		 * 3. 더해진 값이 z에 입력됨
		 * 4. y에 1이 더해짐
		 */
		
		System.out.println("x = " + x);
		System.out.println("z = " + z);
		System.out.println("y = " + y);
		System.out.println("------------");
		
	}

}
