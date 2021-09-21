//package com.lessons.lesson4;
//
//public class Exercise4Car {
//
//
//    String model;
//    int maxSpeed;
//    double turbocharging;
//
//    public Exercise4Car(String model, int maxSpeed, double turbocharging) {
//        this(model ,maxSpeed);                                                 //Вызов другого конструктора этого же класса
//
//        this.turbocharging =  turbocharging;
//    }
//
//    public Exercise4Car(String model, int maxSpeed ) {
//        this.model = model;
//        this.maxSpeed = maxSpeed;
//
//    }
//
//    public static void main(String[] args) {
//
//
//        Exercise4Car VolkswagenE = new Exercise4Car("ID3", 199 );
//        Exercise4Car Volkswagen = new Exercise4Car("Golf", 187, 1.2);
//        System.out.println(Volkswagen.model);
//        System.out.println(Volkswagen.maxSpeed);
//        System.out.println(Volkswagen.turbocharging);
//    }
//
//
//}
