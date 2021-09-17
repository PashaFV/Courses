package com.lessons.lesson3;

import java.util.Arrays;

public class exercise4 {

    public static void  exercisefour (){

        int [] arr = {7,4,3,4,5,7,1,8};

        int repeat = 0;

        int a = 0;

        for (int i = 0; i < arr.length; i++) {

            int rep = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    rep++;
                }

                if (rep > repeat) {
                    repeat = rep;
                    a = arr[i];
                }
            }

        }

        System.out.println(a);






    }
}
