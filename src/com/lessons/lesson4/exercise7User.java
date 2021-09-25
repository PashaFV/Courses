package com.lessons.lesson4;

public class exercise7User {

    private String FirstName;
    private String SecondName;
    private int age;
    GenderEnum gender;



    public exercise7User (String FirstName, String SecondName,  int age, GenderEnum gender) {
        this.FirstName = FirstName;
        this.SecondName = SecondName;
        this.age = age;
        this.gender = gender;


    }
    public void main (){

        System.out.println(FirstName +" "+ SecondName);
        ageplus();
        fullInfoUser();

        Address address = new Address("Belarus", "Minsk");
        address.printAdress();

    }

    public void ageplus (){

        System.out.println("Возраст до увеличения - " + age);

        age++;

        System.out.println("Увеличен возраст на 1, возраст = " + age);
    }

    public void fullInfoUser (){

        System.out.println("Полная информация о пользователе:");
        System.out.println("Имя Фамилия - " + FirstName +" "+ SecondName);
        System.out.println("Увеличенный возраст - " + age);
        System.out.println("Пол - " + gender);


    }

    private class Address {

        private String country;
        private String city;

        public Address (String country, String city){
            this.country = country;
            this.city = city;
        }
        public void printAdress(){
            System.out.println("Страна - " + country + " Город - " + city);
        }
    }
}
