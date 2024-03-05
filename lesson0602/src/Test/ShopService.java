package Test;

public class ShopService {

	private static ShopService shop1 = new ShopService();
	
	private ShopService() {}
	
	public static ShopService getInstance() {
		return shop1;
	}
}
