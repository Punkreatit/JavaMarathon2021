package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random hz = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = hz.nextInt(10000);
            System.out.println(array[i]);
        }
        int min = array[0];
        int max = array[0];
        int sum = 0;
        int score = 0;

        for (int x : array) {
            if (x < min) {
                min = x;
            }
            if (x > max) {
                max = x;
            }
            if (x % 10 == 0) {
                sum = x + sum;
                score++;
            }
        }
        System.out.println("Наибольший элемент: " + max);
        System.out.println("Наименьший элемент: " + min);
        System.out.println("Количество элементов оканчивающихся на 0: " + score);
        System.out.println("Сумма элементов оканчивающихся на 0: " + sum);
    }
}
