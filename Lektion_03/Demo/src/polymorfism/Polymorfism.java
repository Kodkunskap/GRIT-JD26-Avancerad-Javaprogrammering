package polymorfism;

public class Polymorfism {

    public void demo() {

        // Subtypning (runtime)
        Animal mysteryAnimal1 = new Dog();
        Animal mysteryAnimal2 = new Cat();

        mysteryAnimal1.makeSound();
        mysteryAnimal2.makeSound();

        // Överlagring (compiletime)
        mysteryAnimal1.eat();
        mysteryAnimal1.eat("A biscuite?");

    }

}
