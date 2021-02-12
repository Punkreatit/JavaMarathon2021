package day12;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<String> auto = new ArrayList<>();
        auto.add("Audi");
        auto.add("Saab");
        auto.add("Ford");
        auto.add("yourJunk");
        auto.add("Seat");

        System.out.println(auto);

        auto.add(2, "Volvo");
        auto.remove(0);
        System.out.println(auto);


    }
}
