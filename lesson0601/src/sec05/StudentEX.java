package sec05;

public class StudentEX {

	public static void main(String[] args) {


		
//      Student s1 = new Student();
//      System.out.println("s1 ������ Strdent ��ü�� �����Ѵ�.");
//      
//      Student s2 = new Student();
//      System.out.println("s2 ������ Strdent ��ü�� �����Ѵ�.");
      
      Student s1 = new Student(18,"ȫ�浿",2);
      Student s2 = new Student(19,"�̿���",3);
   
      
      System.out.println(s1.age);
      System.out.println(s1.grade);
      System.out.println(s1.name);

      System.out.println(s2.age);
      System.out.println(s2.grade);
      System.out.println(s2.name);
      


	}

}