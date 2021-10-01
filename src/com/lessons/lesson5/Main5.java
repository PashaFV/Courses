package com.lessons.lesson5;

public class Main5 {


    public static void main(String[] args){


        Employee worker1 = new Worker("Иван", "Иванов", 1);
        Employee worker2 = new Worker("Петр", "Петров", 2);
        Employee worker3 = new Worker("Захар", "Сидоров", 3);
        Employee worker4 = new Worker("Ибрагим", "Ибрагимов", 4);

        Employee director1 = new Director("Павел", "Иванов", 3);
        Employee director2 = new Director("Сергей", "Петров", 2);

        ((Director)director1).addWorker(worker1);
        ((Director)director1).addWorker(worker2);
        ((Director)director1).addWorker(worker3);

        ((Director)director2).addWorker(worker4);

        ((Director)director1).addWorker(director2);

        //System.out.println(director1);
        //System.out.println(director2);

        FindService service = new FindService();
        System.out.println(service.findempl((Director) director1, "Иван"));
    }
}
