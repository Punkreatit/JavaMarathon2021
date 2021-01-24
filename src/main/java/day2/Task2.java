package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int a = d.nextInt();
        int b = d.nextInt();
        if (a > b) {
            System.out.println("Ошибка ввода");

        }
        for (a++; a < b; a++) {
            if (a % 5 == 0 && a % 10 != 0) {
                System.out.println(a);
            }
        }

    }


}

