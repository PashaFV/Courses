package com.lessons.lesson3;

import java.util.Arrays;

public class exercise3 {

    public static void  exercisethree (){

        int [] arr = {2,4,1,4,5,7,6,8};

        int a = 0;   //четные
        int b = 0;   //нечетные

        for (int i=0; i < arr.length; i++)
        {
            if (i%2==0) {
                a = a + arr[i];
            }

            if (i%2 != 0) {
                b = b + arr[i];

            }


        }


        System.out.println(a);
        System.out.println(b);
        System.out.println("Разность между суммой элементов = " + (a-b));

    }


}
