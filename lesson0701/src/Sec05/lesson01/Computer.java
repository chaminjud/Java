package Sec05.lesson01;

public class Computer extends Calculator {
             // ���⿡�� ��ӹ���
	
	
	
	@Override //�θ�ü�� �޼��带 �޾Ƽ� �ڽİ�ü�� ������Ͽ� ����ϴ°��� �������̵��� ��
	public double areaCircle(double r){
		System.out.println("Computer ��ü�� areaCircle() ����"); 
		
		return Math.PI * r * r; 
	}
}