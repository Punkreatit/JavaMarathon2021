package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int a = d.nextInt();
        int b = d.nextInt();
        while (a < b) {
            ++a;
            if (a % 5 == 0 && a % 10 != 0) {
                System.out.println(a);
            }
        }
        if (a > b) {
            System.out.println("Ошибка ввода");
        }

    }
}

