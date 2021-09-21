package com.lessons.lesson4;

import java.util.Arrays;

public class exercise2 {


         static int[] arr = {17, 2, 33, 4, 5, 7, 6};
         int max;
         int min;
         int i;
         int index1;

        public static void array (){


            Arrays.sort(arr);

            System.out.println(Arrays.toString(arr) + " - Отсортированный массив");
            //System.out.println("Максимальное число = " + max);
            //System.out.println("Индекс = " + i);

            exercisetwomax();

            exercisefind();


        }

        private static void exercisetwomax() {

            int max = arr[0];

            for (int i = 1; i < arr.length; i++) {

                if (arr[i] > max) {
                    max = arr[i];
                }
            }


            System.out.println("Максимальное число = " + max);


        }


        private static void exercisefind() {

            System.out.println("Индекс числа 33 в массиве - " + Arrays.binarySearch(arr, 33));


        }


    }


