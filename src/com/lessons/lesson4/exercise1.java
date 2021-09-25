//Переписать задачу о сезонах на enum реализацию (switch)

package com.lessons.lesson4;


public class exercise1 {

    public static void exerciseone() {


        SeasonsEnum month = SeasonsEnum.APRIL;

        switch (month) {

            case DECEMBER:
            case JANUARY:
            case FEBRUARY:

                System.out.println("Месяц - " + month + " относится к поре года Зима");
                break;

            case MARTH:
            case APRIL:
            case MAY:

                System.out.println("Месяц - " + month + " относится к поре года Весна");
                break;

            case JUNE:
            case JULY:
            case AUGUST:

                System.out.println("Месяц - " + month + " относится к поре года Лето");
                break;

            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:

                System.out.println("Месяц - " + month + " относится к поре года Осень");
                break;

            default:
                System.out.println("Введите месяц правильно!");

        }

    }
}
