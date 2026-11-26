package abstractdemo;

public class AbstractDemo {

    public void demo() {
        Car c = new Car();

        c.start();  // This method comes from the abstract class Vehicle
        c.move();   // This method come from the Car class
    }

}
