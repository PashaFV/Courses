package com.lessons.lesson5;

public abstract class Employee extends Person {


    private int experience;
    protected PositionEnum position;
    private int basic = 1000;


    public Employee(String FirstName, String SecondName, int experience){
        super(FirstName, SecondName);
        this.experience = experience;
    }

    public abstract void setPosition();

    public int getSalary(){
        return basic * position.getKoef() * experience;
    }

    public void printEmployee() {
        System.out.println(experience);
        System.out.println(basic);
        System.out.println( basic);
    }
}
