package com.lessons.lesson4;

public class exercise3User {

    private String FirstName;
    private String SecondName;
    private int age;
    GenderEnum gender;



    public exercise3User (String FirstName, String SecondName,  int age, GenderEnum gender) {
        this.FirstName = FirstName;
        this.SecondName = SecondName;
        this.age = age;
        this.gender = gender;


            }
    public void main (){

        System.out.println(FirstName +" "+ SecondName);
        ageplus();
        fullInfoUser();
        System.out.println();


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

    }



