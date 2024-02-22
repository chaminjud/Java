package sec05;

public class Student {
	//필드 - 객체의 데이터가 저장되는 곳
	int age;
	String name;
	int grade;
	
	//생성자 - 클레스 명과 같다. ex) Student(){} 둘다 가능 / 기본적으로 생성 , 객체 생성 시 초기화 역활
	Student(int age, String name, int grade) {
		this.age = age; //우측 age는 메개변수 좌측 this.age는 필드값 우측 값을 받아서 좌측을 초기화
		this.name = name; // 우측 메게변수값은 변해도 상관X 필드값 this는 고정
		this.grade = grade;
	}
	
	//메소드 - 객체의 동작으로 호출시 실행되는 곳
	public void study() {
		System.out.println("수업시간에는 공부를 열심히 합니다.");
	}
	public void home() {
		System.out.println("수업이 끝나면 집에 갑니다.");
	}
}
