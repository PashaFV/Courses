package com.lessons.lesson4;

public class exercise6 {

    public int value (int value2) {
        if (value2 <= 1){
            System.out.println("Введите большее число");

        }else {
            System.out.println("Вы ввели число " + value2);
        }
        return (value2);
    }

    public int value (int value2, int value3, String name){
        System.out.println("введено два числа- " + value2 + " и " + value3 + " " + name);
        return (value2);
    }

}
