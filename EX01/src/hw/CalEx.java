package hw;

import java.util.Scanner;

public class CalEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cal c1 = new Cal();

        c1.powerOn();

        boolean r = true;
        while (r) {
            System.out.println("-------------------------------------------");
            System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈| 4.나눗셈 | 5.종료");
            System.out.println("-------------------------------------------");
            System.out.print("선택 > ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    int num1 = sc.nextInt();
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    int num2 = sc.nextInt();
                    int result1 = c1.add(num1, num2);
                    System.out.println("덧셈결과 : " + result1);
                    break;
                case 2:
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    int num3 = sc.nextInt();
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    int num4 = sc.nextInt();
                    int result2 = c1.min(num3, num4);
                    System.out.println("뺄셈결과 : " + result2);
                    break;
                case 3:
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    int num5 = sc.nextInt();
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    int num6 = sc.nextInt();
                    double result3 = c1.cro(num5, num6);
                    System.out.println("곱셈결과 : " + result3);
                    break;
                case 4:
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    int x = sc.nextInt();
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    int y = sc.nextInt();
                    double result4 = c1.divide(x, y);
                    System.out.println("나눗셈 결과 : " + result4);
                    break;
                case 5:
                    r = false;
                    break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }

        c1.powerOff();
    }
}