package com.lessons.lesson2;

import java.util.Scanner;

public class exercise4 {

    public static void  exercisefour () {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");

        int a = in.nextInt();

        System.out.print("Введите второе число: ");

        int b = in.nextInt();

        int sum = 0;

        int summ = 0;

        for (int i = a+1; i < b; i++)

        {
            sum += i;

            if (i % 3 == 0) {
                summ += i;
            }
        }

        System.out.println("Сумма чисел между ними = " + sum);
        System.out.println("Сумма чисел которые деляться на три = " + summ);










    }

}
