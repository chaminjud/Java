package sec04;

public class GarbageExam {

	public static void main(String[] args) {

		
		String hobby = "여행"; // 힙영역에 "여행"이라는 객체가 생성되고 주소가 hobby에 할당
		hobby = null; //여행이라는 String 객체가 Garbage Collector 사용으로 삭제
		
		String bestCar = "스포티지";
		String worstCar = bestCar; // bestCAr에 저장된 스포티지 객체 번지를 worstCar에 대입
		bestCar = null; // worstCar는 남아있어서 "스포티지" 출력
		
		System.out.println(worstCar);
	}

}
