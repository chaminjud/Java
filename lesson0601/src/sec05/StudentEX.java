package sec05;

public class StudentEX {

	public static void main(String[] args) {


		
//      Student s1 = new Student();
//      System.out.println("s1 변수가 Strdent 객체를 참조한다.");
//      
//      Student s2 = new Student();
//      System.out.println("s2 변수가 Strdent 객체를 참조한다.");
      
      Student s1 = new Student(18,"홍길동",2);
      Student s2 = new Student(19,"이영자",3);
   
      
      System.out.println(s1.age);
      System.out.println(s1.grade);
      System.out.println(s1.name);

      System.out.println(s2.age);
      System.out.println(s2.grade);
      System.out.println(s2.name);
      


	}

}
