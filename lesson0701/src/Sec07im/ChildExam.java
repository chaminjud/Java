package Sec07im;

public class ChildExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�ڽ� Ŭ���� ��ü�� �����ϸ鼭 �θ� Ÿ������ �ڵ� Ÿ�Ժ�ȯ
		Parent parent = new Child();
		
		
		//Parent Ÿ������ ���
		parent.field = "������1";
		parent.method1();
		parent.method2();
		
		
		//�Ϲ������δ� ��� �Ұ����ϰ� ���� Ÿ�Ժ�ȯ�� ������Ѵ�.
//		parent.field2;
//		parent.method3();
		
		//�ڽ�Ķ���� Ÿ������ ���� Ÿ�Ժ�ȯ
		
		Child child = (Child) parent;
		
		child.field = "������1";
		child.method1();
		child.method2();
		
		child.field2 = "������2";
		child.method3();
	}

}
