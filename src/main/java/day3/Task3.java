package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int c =0;
        while (c<5) {
            double a = d.nextDouble();
            double b = d.nextDouble();
            if (b == 0) {
                System.out.println("Деление на 0");
                c++;
                continue;
            }
            System.out.println(a/b);
            c++;
        }


    }
}
