package com.lessons.lesson2;

import java.util.Scanner;

public class exercise2 {

    public static void exercisetwo() {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите месяц: ");
        String month = in.nextLine();

        switch (month) {

            case "декабрь":
            case "январь":
            case "февраль":

                System.out.println("Пора года - Зима");
                break;

            case "март":
            case "апрель":
            case "май":

                System.out.println("Пора года - Весна");
                break;

            case "июнь":
            case "июль":
            case "август":

                System.out.println("Пора года - Лето");
                break;

            case "сентябрь":
            case "октябрь":
            case "ноябрь":

                System.out.println("Пора года - Осень");
                break;

            default:
                System.out.println("Введите месяц правильно!");

        }
    }
}
