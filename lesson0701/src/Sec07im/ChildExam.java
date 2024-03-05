package Sec07im;

public class ChildExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//자식 클래스 객체를 생성하면서 부모 타입으로 자동 타입변환
		Parent parent = new Child();
		
		
		//Parent 타입으로 사용
		parent.field = "데이터1";
		parent.method1();
		parent.method2();
		
		
		//일반적으로는 사용 불가능하고 강제 타입변환을 해줘야한다.
//		parent.field2;
//		parent.method3();
		
		//자식캘르스 타입으로 강제 타입변환
		
		Child child = (Child) parent;
		
		child.field = "데이터1";
		child.method1();
		child.method2();
		
		child.field2 = "데이터2";
		child.method3();
	}

}
