package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите размерность массива");
        Scanner scan = new Scanner(System.in);
        int x=scan.nextInt();

        Random random = new Random();
        int [] array = new int[x];
        for (int i=0; i<array.length; i++){
            array[i]=random.nextInt(50);

        }
        System.out.println(Arrays.toString(array));

        for(int i=1; i<array.length; i+=2){
            array[i]=0;
        }

        System.out.println(Arrays.toString(array));
    }
}
