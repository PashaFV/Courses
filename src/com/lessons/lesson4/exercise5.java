package com.lessons.lesson4;

import java.util.Scanner;

public class exercise5 {

    @Deprecated
   public void word (){
    Scanner in = new Scanner(System.in);
        System.out.print("Введите любое слово, либо 'exit' для выхода: ");
    String word = in.nextLine();

        while ( word != "exit" ) {

            if (word.equals("exit")) {
                System.out.println("Пока пока");
                break;
            } else {

                System.out.println("Вы ввели слово: " + word);
                System.out.println("Введите слово еще раз: ");
                word = in.nextLine();


            }
        }
    }
    public void newword (){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое слово, либо 'exit' для выхода: ");
        String word = in.nextLine();

        while (true) {

            if (word.equals("exit")) {
                System.out.println("Пока пока");
                break;
            } else {

                System.out.println("Вы ввели слово: " + word);
                System.out.println("Введите слово еще раз: ");
                word = in.nextLine();


            }
        }

    }
}
