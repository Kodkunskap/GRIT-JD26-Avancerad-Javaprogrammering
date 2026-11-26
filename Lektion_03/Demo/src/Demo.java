import abstractdemo.AbstractDemo;
import generics.Generics;
import interfacedemo.InterfaceDemo;
import polymorfism.Polymorfism;

import java.util.Scanner;

public class Demo {

    public static void main() {
        new Demo().run();
    }

    public void run() {

        System.out.println("""
                1. Polymorfism
                2. Interface
                3. Abstrakta klasser
                4. Generics
                """);
        System.out.println("Demo: ");
        Scanner sc = new Scanner(System.in);
        int i = 0;
        try {
            i = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Ogiltig inmatning");
            return;
        }

        switch(i) {
            case 1 -> new  Polymorfism().demo();
            case 2 -> new InterfaceDemo().demo();
            case 3 -> new AbstractDemo().demo();
            case 4 -> new Generics().demo();
            default -> System.out.println("Ogiltigt val");
        }

    }

}
