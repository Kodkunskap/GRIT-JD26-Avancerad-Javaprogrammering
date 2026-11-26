package generics;

public class Calculator<T extends Number> {

    T tal1;
    T tal2;

    public void setTal1(T tal1) {
        this.tal1 = tal1;
    }

    public void setTal2(T tal2) {
        this.tal2 = tal2;
    }

    public double add() {
        return tal1.doubleValue() + tal2.doubleValue();
    }

}
