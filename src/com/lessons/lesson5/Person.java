package com.lessons.lesson5;

import com.lessons.lesson4.GenderEnum;

public class Person {

    private String FirstName;
    private String SecondName;

    public Person (String FirstName, String SecondName) {
        this.FirstName = FirstName;
        this.SecondName = SecondName;
    }

    public void printInfo (){
        System.out.println(FirstName +" "+ SecondName);
    }
}
