package Sec10;

public class AnimalExam {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		
		cat.breathe(); // animal�޼���
		cat.sound();
		
		dog.breathe(); // animal �޼���
		dog.sound();
		
		System.out.println();
		//�������� �̿��� ���
		
		animalSound(new Cat());		
        System.out.println();
        animalSound(new Dog());		

	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
}
