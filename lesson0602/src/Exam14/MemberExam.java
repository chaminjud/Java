package Exam14;

public class MemberExam {

	public static void main(String[] args) {
	
		
		Member mem = new Member();
		
		//setter�� �Ű������� ���� �־��ش�
		mem.setNum(1);
		mem.setUserName("ȫ�浿");
		mem.setUserEmail("jhog@ghow.com");
		mem.setGender(false);
		mem.setCount(1000);
		mem.setAddress("������");
		mem.setAge(21);
		
		//���� ���� �������ִ� getter�� ����ؼ� ���� ����Ѵ�.
		System.out.println(mem.getNum());
		System.out.println(mem.getUserName());
		System.out.println(mem.getUserEmail());
		String g;
		if(mem.isGender()) {
			g = "����";
		}else {
			g = "����";
		}
		System.out.println(g);
		System.out.println(mem.getCount());
		System.out.println(mem.getAddress());
		System.out.println(mem.getAge());
		
		System.out.println(mem.toString());

	}

}