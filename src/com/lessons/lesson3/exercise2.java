//В произвольном массиве найти сумму минимального и максимального элементов.

package com.lessons.lesson3;

import java.util.Arrays;

public class exercise2 {

    public static void  exercisetwo (){


        int [] arr = {17,2,33,4,5,7,6};
        int max = arr[0];
        int min = arr[0];

        for (int i=1; i < arr.length; i++)
        {
            if (arr[i]< min){
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Минимальное число = " + min);
        System.out.println("Максимальное число = " + max);
        System.out.println("Сумма максимального и минимального числа = " + (min + max));


    }
}
