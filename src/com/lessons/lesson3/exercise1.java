//Создать массив на n-элементов и заполнить его числами фиббоначи.

package com.lessons.lesson3;

import java.util.Arrays;

public class exercise1 {

    public static void  exerciseone () {

        int [] arrfeb = new int[10];
        for (int i=1; i < arrfeb.length; i++) {

            if (i<2){
                arrfeb[i]=1;

            }
            else {
                arrfeb[i] = arrfeb[i-2] + arrfeb [i-1];

            }

        }

        System.out.println(Arrays.toString(arrfeb));






    }
}
