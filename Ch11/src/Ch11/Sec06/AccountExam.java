package Ch11.Sec06;

public class AccountExam {

	public static void main(String[] args) {
		
		Account acc = new Account();
		
		//�����ϱ�
		acc.deposit(10000000);
		System.out.println("���ݾ� :" + acc.getBalance() + "��");
		
		//����ϱ�
		
	    try {
			acc.withdraw(10000001);
		} catch (XxxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
