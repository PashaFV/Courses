package com.lessons.lesson5;

import java.util.Arrays;

public class Director extends Employee {

   private Employee[] employees;

    public Director(String FirstName, String SecondName, int experience) {
        super(FirstName, SecondName, experience);

    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void addWorker(Employee employee) {
       if (employees == null){
           employees = new Employee[1];
           employees[0] = employee;
       } else {
           employees = Arrays.copyOf(employees, employees.length +1);
            employees[employees.length -1] = employee;
       }
    }

    @Override
    public void setPosition() {
        this.position = PositionEnum.DIRECTOR;

    }

    @Override
    public String toString() {
        return "Директор {" +
                " Имя директора = " + FirstName  + " " +
                " Фамилия директора = " + SecondName  + " " +
                " Должность =" + position + " " +
                " ЗП = " + getSalary() + " " +
                " В подчинении = " + Arrays.toString(employees) + " " +
                '}';
    }

    @Override
    public int getSalary() {
        if(employees == null) {
            return super.getSalary();
        }else {
            return super.getSalary() * employees.length;
        }



    }
}
