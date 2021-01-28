package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random x = new Random();

        int[][] array = new int[12][8];
        for (int i = 0; i < array.length; i++) {
            for (int f = 0; f < array[i].length; f++) {
                array[i][f] = x.nextInt(50);
                //System.out.print(array[i][f] + " ");

            }
            //System.out.println();

        }
        int max = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];

                if (sum >= max) {
                    max = sum;
                    count = i;
                }
            }
            //System.out.println(sum);
        }
        //System.out.println(max + " maximum");
        //System.out.println();
        System.out.println(count);


    }
}


