package com.lessons.lesson6;

public class MyInterfaceImp implements MyInterface {
    @Override
    public void print() {
        System.out.println("print");
    }

    @Override
    public Integer getSalary() {
        return 1000;
    }
}
