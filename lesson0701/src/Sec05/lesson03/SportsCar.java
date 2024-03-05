package Sec05.lesson03;

public class SportsCar extends Car{
     @Override
     public void speedUp() {
    	 speed += 10; // Car의 필드를 증가시킴 
     }
     
//     @Override
//     public void stop() {
//    	 System.out.println("스포츠카를 정지 시킵니다.");
//     }  // final메소드이기 때문에 override할 수 없다.
}
