package day4;

import java.util.Random;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random x = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = x.nextInt(10000);
            //System.out.println(array[i]);
        }
        int maxSum = 0;
        int index = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int o = i; o < i + 3; o++) {
                sum = sum+array[o];}

            if (sum>maxSum) {
                    maxSum=sum;
                    index=i;
                }

            }
            System.out.println(maxSum);
            System.out.println(index);


        }
    }

