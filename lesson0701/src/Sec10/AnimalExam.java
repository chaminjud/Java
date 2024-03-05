package Sec10;

public class AnimalExam {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		
		cat.breathe(); // animal메서드
		cat.sound();
		
		dog.breathe(); // animal 메서드
		dog.sound();
		
		System.out.println();
		//다형성을 이용해 출력
		
		animalSound(new Cat());		
        System.out.println();
        animalSound(new Dog());		

	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
}
