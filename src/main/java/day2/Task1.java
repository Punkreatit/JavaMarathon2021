package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        int s = b.nextInt();
        if (s <= 4 && s >= 1) {
            System.out.println("Малоэтажный дом");
        } else if (s > 4 && s <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (s >= 9) {
            System.out.println("Многоэтажный дом");
        } else if (s < 0) {
            System.out.println("Ошибка ввода");
        }


    }
}
