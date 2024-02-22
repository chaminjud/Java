package Muchine;

public class Atmachine {

	//product�� �迭�� ����� ��ü�� 4�� ������
	private product[] tray1 = new product[5];
	private product[] tray2 = new product[5];
	private product[] tray3 = new product[5];
	private product[] tray4 = new product[5];
	
	private int money; // ���Ǳ⿡ ���� ��
	
	//���� 5���� �ִ� ��ǰ���� �迭�� ���� (2���� �迭)
	private product[][] arr = { tray1, tray2, tray3, tray4};
	
	//�����ڿ��� ��ǰ�� ���� - ��ǰ�� ���Ǳ� �ȿ� ������
	
	public Atmachine() {
		for(int i =0; i< tray1.length; i++) {
			tray1[i] = new product("�ݶ�", 800);
		}
		for(int i =0; i< tray2.length; i++) {
			tray2[i] = new product("���̴�", 700);
		}
		for(int i =0; i< tray3.length; i++) {
			tray3[i] = new product("��Ŀ��", 900);
		}
		for(int i =0; i< tray4.length; i++) {
			tray4[i] = new product("�̿���ȭ�̹�", 500);
		}
	}
	//�ּ� ������ ���ϴ� �Լ�(���Ǳ⸸ �Ǵ��ϸ� �ǹǷ� private)
	private int getMinPrice() {
	      int minPrice = 9999999;
	      for(int i =0; i< arr.length; i++) {
	    	  for(int j =0; j < arr[i].length; j++) {
	    		  if(arr[i][j] != null && arr[i][j].getPrice() < minPrice) {
	    			  minPrice = arr[i][j].getPrice();
	    		  }
	    	  }
	      }
	      return minPrice;
	}
	
	//���� �Է¹޴� �Լ� (������� �Ǵ�)
	public boolean inputMoney(int money) {
		this.money += money;
		int minPrice = getMinPrice();
		return this.money >= minPrice;
	}
	
	//���� ��ǰ�� ������ �����ִ� �Լ� - �� �������� ���Ǳ⸸ �˸� �Ǵ� private 
	private int countOfTray(product[] tray) {
		int count =0;
		for(int i=0; i < tray.length; i++) {
			if(tray[i] != null) {
				count++;
			}
		}
		return count;
	}
	
	//��ǰ����, ���� ����ϴ� �Լ�
	void show() {
		System.out.println();
		System.out.printf("%s (%d��)\n", tray1[0].toString(),countOfTray(tray1));
		System.out.printf("%s (%d��)\n", tray2[0].toString(),countOfTray(tray1));
		System.out.printf("%s (%d��)\n", tray3[0].toString(),countOfTray(tray1));
		System.out.printf("%s (%d��)\n", tray4[0].toString(),countOfTray(tray1));
	}
	
	//�Ž����� ��ȯ �ϴ� �Լ�
	public int getChange() {
		int change = this.money;
		this.money = 0;
		return change;
	}
	
	
	//�ݾ��� ������� �Ǵ��ϴ� �Լ�
	public boolean isEnoughMoney() {
		return getMinPrice() <= money;
	}
	
	
	
	//��ǰ�� ��ȯ�ϴ� �Լ�
	public product getProduct(int select) {
		select -= 1;
		product product = null;
		for(int i = arr[select].length -1; i !=0; i--) {
			//������ �־�� �Ѵ�.
			//��ǰ�� ������ �Էµ� ������ �۰ų� ���ƾ� �Ѵ�.
			boolean flag1 = arr[select][i] != null;
			boolean flag2 = flag1 && arr[select][i].getPrice() <= money;
			if(flag2) {
				product = arr[select][i]; // ��ǰ�� ���
				arr[select][i] = null; //���� ��ǰ�� �ִ� �ڸ��� ������ �����.
				money -= product.getPrice(); //���� ������ ��ǰ �ݾ׸�ŭ �����Ѵ�.
				break;
			}
			
		}
		return product;
	}
}