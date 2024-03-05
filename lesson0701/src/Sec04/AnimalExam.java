package Sec04;

public class AnimalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //오버라이딩
		
		
		
		Animal aa = new Animal(); //부모 클래스
        Brid bb = new Brid(); // 상속받은 자식 클래스
        Cat cc = new Cat(); // 상속받은 자식 클래스
        Dog dd = new Dog(); // 상속받은 자식 클래스
        
        aa.cry(); 
        // 부모클래스의 cry() 메소드를  자식들이 자신에 맞게 오버라이딩해서 사용함
        bb.cry();
        cc.cry();
        dd.cry();
		
		
	}

}
