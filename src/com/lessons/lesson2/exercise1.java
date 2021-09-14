package com.lessons.lesson2;

import java.util.Scanner;

public class exercise1 {

    public static void  exerciseone () {

        Scanner in = new Scanner(System.in);
        String by = in.nextLine();

        switch (by) {

            case "a":
            case "e":
            case "i":
            case "o":
            case "u":

                System.out.println("Буква " + by + " гласная");
                break;

            case "b":
            case "c":
            case "d":
            case "f":
            case "g":
            case "h":
            case "j":
            case "k":
            case "l":
            case "m":
            case "n":
            case "p":
            case "q":
            case "r":
            case "s":
            case "t":
            case "v":
            case "w":
            case "x":
            case "y":
            case "z":

                System.out.println("Буква " + by + " согласная");
                break;
            default:
                System.out.println("default");


        }
    }

}


