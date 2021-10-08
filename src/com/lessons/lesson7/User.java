package com.lessons.lesson7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class User implements Comparable <User> {

    private String name;
    private String gender;
    private int age;

    public User(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User o) {

        User newUser = (User) o;

        if (age < newUser.age) {
            System.out.println("Возраст первого юзера меньше чем второго" );
            return 1;
        } else if (age > newUser.age){
            System.out.println("Возраст второго юзера больше чем первого" );
            return -1;
        } else if (age == newUser.age){

            if (name.charAt(0) == newUser.name.charAt(0)) {
                System.out.println("Возраст одинаковый - имя не отличается" );

                return 1;
            }
            System.out.println("Возраст одинаковый - имя отличается" );
            return 0;
        }

        return 0;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return age == user.age && Objects.equals(name, user.name) && Objects.equals(gender, user.gender);
//    }
//
//    @Override
////    public int hashCode() {
//        return Objects.hash(name, gender, age);
//    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}