package com.lessons.lesson2;

public class ForLoop {

    public int testForLoop () {

        int value = 0;

        for ( int in = 0 ; in<10 ; in ++ ) {
            value = value + in;
            System.out.println(in);
            System.out.println(value);
        }
        return value;

    }
}
