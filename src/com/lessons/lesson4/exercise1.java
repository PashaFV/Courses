package com.lessons.lesson4;

import java.util.Scanner;


public class exercise1 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Введите месяц: ");
        String season = in.nextLine();

        switch (season) {

            case "декабрь":
            case "январь":
            case "февраль":

                System.out.println("Пора года - " + SeasonsEnum.WINTER);
                break;

            case "март":
            case "апрель":
            case "май":

                System.out.println("Пора года - " + SeasonsEnum.SPRING);
                break;

            case "июнь":
            case "июль":
            case "август":

                System.out.println("Пора года - " + SeasonsEnum.SUMMER);
                break;

            case "сентябрь":
            case "октябрь":
            case "ноябрь":

                System.out.println("Пора года - " + SeasonsEnum.AUTUMN);
                break;

            default:
                System.out.println("Введите месяц правильно!");

        }

    }
}
