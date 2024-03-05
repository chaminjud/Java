package Sec05.lesson01;

public class Computer extends Calculator {
             // 계산기에게 상속받음
	
	
	
	@Override //부모객체에 메서드를 받아서 자식객체가 재수정하여 사용하는것을 오버라이드라고 함
	public double areaCircle(double r){
		System.out.println("Computer 객체의 areaCircle() 실행"); 
		
		return Math.PI * r * r; 
	}
}
