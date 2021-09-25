package com.lessons.lesson5;

public class Worker extends Employee {

    public Worker(String FirstName, String SecondName, int experience) {
        super(FirstName, SecondName, experience);
    }

    @Override
    public void setPosition() {
        this.position = PositionEnum.WORKER;
    }
}
