package abstractdemo;

abstract class Vehicle {
    abstract void move();

    void start() {
        System.out.println("Engine started");
    }
}