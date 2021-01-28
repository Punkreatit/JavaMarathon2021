package day4;

import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] array = new int[a];
        Random x = new Random();
        int eight = 0;
        int one = 0;
        int even=0;
        int uneven=0;
        int sum =0;
        for(int i=0;i<array.length;i++){
            array[i]=x.nextInt(10);
        }
        for (int elementOfArray:array){
            System.out.println(elementOfArray);
        if(elementOfArray>8){
            eight++;}
             else if  (elementOfArray==1){
                 one++;}
        if(elementOfArray%2==0){
                even++;
            }else{
                uneven++;}
            sum = sum+elementOfArray;
        }

        System.out.println("Длина массива: "+a);
        System.out.println("Количество чисел больше 8: " + eight );
        System.out.println("Количество чисел равных 1: " + one);
        System.out.println("Количество четных чисел: "+ even);
        System.out.println("Количество нечетных чисел: "+ uneven);
        System.out.println("Сумма всех элементов массива: "+ sum);}

    }

