package com.lessons.lesson5;

public abstract class Employee extends Person {


    private int experience;
    protected PositionEnum position;
    private int basic = 1000;


    public Employee(String FirstName, String SecondName, int experience){
        super(FirstName, SecondName);
        this.experience = experience;
        setPosition();
    }

    public abstract void setPosition();

    public int getSalary()
    {
        return basic * position.getKoef() * experience;
    }

    @Override
    public String toString() {
        return "Работник {" +
                "Имя = " + FirstName + " " +
                "Фамилия = " + SecondName + " " +
                "Стаж = " + experience + " " +
                "Должность = " + position + " " +
                "ЗП = " + getSalary() + " " +
                '}';
    }


}
