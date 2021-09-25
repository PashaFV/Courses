package com.lessons.lesson4;

public class Exercise4Car {


        String model;
        int maxSpeed;
        double turbocharging;

        public Exercise4Car(String model, int maxSpeed, double turbocharging) {
            this(model ,maxSpeed);                                                 //Вызов другого конструктора этого же класса

            this.turbocharging =  turbocharging;
        }

        public Exercise4Car(String model, int maxSpeed ) {
            this.model = model;
            this.maxSpeed = maxSpeed;

        }

        public void infoCar() {


            System.out.println("Модель - " +model);
            System.out.println("Максимальная скорость - " + maxSpeed);
            if(turbocharging==0) {
                System.out.println("Без Турбонаддува " );
            }else {
                System.out.println("Турбонаддув -" + turbocharging);
            }
        }


}
