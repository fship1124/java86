package day1101.exam;

public class AnimalTest {
    public static void main(String[] args) {
		Dog dog = new Dog("∏€∏€¿Ã" );
		Duck duck = new Duck("≤–≤–¿Ã");
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
