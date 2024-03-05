package Test;

public class Parent {

	public String nation;
	
	public Parent() {
		//this() 다른 생성자를 가져오는것이다
		//여기서는 밑에 만들어둔 String을 매개변수로 갖는 생성자
		// 즉 this는 "대한민국"이라는 매개변수로 호출된다.
		this("대한민국");
		System.out.println("Parent() call");
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation call");
	}
}
