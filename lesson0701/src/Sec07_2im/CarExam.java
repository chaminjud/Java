package Sec07_2im;

public class CarExam {

	public static void main(String[] args) {
		
		
		//Car °´Ã¼ »ı¼º
		
		Car myCar = new Car();
		
		//Tire °´Ã¼ ÀåÂø
		myCar.tire = new Tire();
		myCar.run();
		
		//ÇÑ±¹ Å¸ÀÌ¾î °´Ã¼ ÀåÂø
		myCar.tire = new HankookTire();
		myCar.run();
		
		//±İÈ£ Å¸ÀÌ¾î °´Ã¼ ÀåÂø
		myCar.tire = new KumhoTire();
		myCar.run();
	}

}
