package com.lessons.lesson7;

import java.util.Objects;

public class User implements Comparable {

    private String name;
    private String gender;
    private int age;

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
    public int compareTo(Object o) {
        return 0;
    }
}
