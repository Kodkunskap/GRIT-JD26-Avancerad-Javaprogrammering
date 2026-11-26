package polymorfism;

public class Animal {

    void makeSound() {
        System.out.println("Some sound!");
    }


    /*

        Överlagring - Samma namn på metoden men olika
        parametrar

     */

    void eat() {
        System.out.println("Eating!");
    }

    void eat(String food) {
        System.out.println("Eating " + food);
    }

}
