package Muchine;

import java.util.Scanner;

public class MyAutoMachine {

	public static void main(String[] args) {
		
		
		 Atmachine machine = new Atmachine();
		 
		 Scanner sc = new Scanner(System.in);
		 int money, select;
		 
		 while(true) {
			 System.out.println("금액을 넣어주세요. >>");
			 money = Integer.parseInt(sc.nextLine()); //금액을 입력 받는다.
			 
			 boolean ready = machine.inputMoney(money); // 돈이 자판기에 전달됨
			 if(ready) { //금액이 충분하면 루프에서 나온고 아니면 계속 루프를 돌며 금액을 입력하도록 한다.
				 break;
			 }
		 }
		 
		 while(machine.isEnoughMoney()) {
			 
			 //구매할 상품의 목록을 출력
			 machine.show();
			 
			 System.out.println("음료의 번호를 선택하세요 >>");
			 select = Integer.parseInt(sc.nextLine());
			 product drink = machine.getProduct(select);
			 if(drink == null) {
				 System.out.println("상품이 없거나 금액이 부족합니다");
			 }else {
				 System.out.println(drink.getName() + "가 하나 나왔습니다.");
			 }
			 
		 }
		 int change = machine.getChange();
		 System.out.println("거스름 돈 "+ change + "원");
		 

	}

}
