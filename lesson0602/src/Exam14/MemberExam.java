package Exam14;

public class MemberExam {

	public static void main(String[] args) {
	
		
		Member mem = new Member();
		
		//setter에 매개변수에 값을 넣어준다
		mem.setNum(1);
		mem.setUserName("홍길동");
		mem.setUserEmail("jhog@ghow.com");
		mem.setGender(false);
		mem.setCount(1000);
		mem.setAddress("김포시");
		mem.setAge(21);
		
		//넣은 값을 리턴해주는 getter을 사용해서 값을 출력한다.
		System.out.println(mem.getNum());
		System.out.println(mem.getUserName());
		System.out.println(mem.getUserEmail());
		String g;
		if(mem.isGender()) {
			g = "여자";
		}else {
			g = "남자";
		}
		System.out.println(g);
		System.out.println(mem.getCount());
		System.out.println(mem.getAddress());
		System.out.println(mem.getAge());
		
		System.out.println(mem.toString());

	}

}
