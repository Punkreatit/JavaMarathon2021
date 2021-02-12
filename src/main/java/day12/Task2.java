package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < 31; i = i + 2) {
            number.add(i);
        }
        for (int i = 300; i < 351; i = i + 2) {
            number.add(i);
        }
        System.out.println(number);

    }

}

