package com.lessons.lesson7;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(gender, user.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age);
    }

    @Override
    public int compareTo(User o) {
        User newUser = (User) o;

        if (age < newUser.age) {
            return 1;
        } else if (age < newUser.age){
            return -1;
        } else if (age == newUser.age){

            if (name.charAt(0) > newUser.name.charAt(0)) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
