package Ch11.Sec06;

public class AccountExam {

	public static void main(String[] args) {
		
		Account acc = new Account();
		
		//저금하기
		acc.deposit(10000000);
		System.out.println("예금액 :" + acc.getBalance() + "원");
		
		//출금하기
		
	    try {
			acc.withdraw(10000001);
		} catch (XxxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
