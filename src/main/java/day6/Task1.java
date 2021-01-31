package day6;

import java.sql.SQLOutput;

public class Task1 {
    public static void main(String[] args) {
        Car ford = new Car();
        ford.setColor("rusty");
        ford.setYearOfRelease(1923);
        ford.setModel("T");
        ford.print();
        ford.info();
        System.out.println("Разница с указанным годом: " + ford.yearDifference(-2000));

        System.out.println();

        Motorbike honda = new Motorbike(1998, "red", "Transalp");
        honda.info();
        honda.print();
        System.out.println("Разница с указанным годом: " + honda.yearDifference(2021));


    }
}
