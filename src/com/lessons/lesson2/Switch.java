package com.lessons.lesson2;

public class Switch {

    public void testSwitchOperator () {

        int value = 2;

        switch (value) {
            case 1:
            case 2:
                System.out.println("This is 1");
                break;
            case 10:
                System.out.println("This is 15");
                break;
            default:
                System.out.println("This is default");
        }
    }
}
