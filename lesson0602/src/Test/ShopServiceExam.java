package Test;

public class ShopServiceExam {

	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
		
		

	}

}
