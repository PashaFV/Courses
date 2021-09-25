//Создать класс для работы с  массивами чисел. Создать методы для сортировки, нахождения максимального элемента, поиска номера элемента в массиве по его значению (любое вхождение). Всю общую логику вынести в приватные методы.


package com.lessons.lesson4;

import java.util.Arrays;

public class exercise2 {


         int[] arr = {17, 2, 33, 4, 5, 7, 6};
         int max;
         int min;
         int i;
         int index1;

        public void array (){


            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr) + " - Отсортированный массив");

            exercisetwomax();

            exercisefind();

        }

        private void exercisetwomax() {

            int max = arr[0];

            for (int i = 1; i < arr.length; i++) {

                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.println("Максимальное число = " + max);

        }

        private void exercisefind() {

            System.out.println("Индекс числа максимального числа в отсортированном массиве - " + Arrays.binarySearch(arr, 33));

        }

    }


