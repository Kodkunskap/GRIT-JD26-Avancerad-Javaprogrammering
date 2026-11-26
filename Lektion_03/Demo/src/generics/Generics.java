package generics;

public class Generics {

    public void demo() {

        Calculator<Integer> integerCalculator = new Calculator<Integer>();
        Calculator<Double> doubleCalculator = new Calculator<Double>();

        integerCalculator.setTal1(5);
        integerCalculator.setTal2(10);
        doubleCalculator.setTal1(5d);
        doubleCalculator.setTal2(10.0);

        Double summaDouble = integerCalculator.add();
        Double summaDouble2 = doubleCalculator.add();

    }

}
