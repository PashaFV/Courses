package com.lessons.lesson2;

import java.util.Scanner;

public class exercise1if {

    public static void  exerciseoneif () {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите букву: ");
        char by = in.next().charAt(0);



        if ((by == 'a') || (by == 'e') || (by == 'i') || (by == 'o') || (by == 'u') || (by == 'y')) {

            System.out.println ("Буква " + by + " - гласная");

        } else {

            System.out.println ("Буква " + by + " - cогласная");

        }

    }
}
