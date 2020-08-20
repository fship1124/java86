package day1101.exam;

public class AnimalTest {
    public static void main(String[] args) {
		Dog dog = new Dog("�۸���" );
		Duck duck = new Duck("�в���");
		dog.eat();
		crying(dog);
		duck.eat();
		crying(duck);
		flying(duck);
	}
    
    private static void crying(Animal a) {
    	a.cry();
    }
    
    private static void flying(Flyable f) {
    	f.fly();
    }
    
}
