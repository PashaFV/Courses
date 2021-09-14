package com.lessons.lesson2;

import java.util.Scanner;

public class exercise3 {

    public static void  exercisethree () {


        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое слово, либо 'exit' для выхода: ");
        String word = in.nextLine();

        while ( word != "exit" ){

            if (word.equals("exit")) {
                System.out.println("Пока пока");
                break;
            } else {

                System.out.println("Вы ввели слово: " + word );
                System.out.println("Введите слово еще раз: ");
                word = in.nextLine();


            }
        }

    }

}










