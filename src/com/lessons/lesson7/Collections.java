package com.lessons.lesson7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Collections {
    public static void main(String[] args){

        List<User> ListUsers = new ArrayList<>();
        HashSet<User> SetUsers = new HashSet<>();

        ListUsers.add(new User("Pavel","m", 18));
        ListUsers.add(new User("Ivan","g", 24));
        ListUsers.add(new User("Oleg","g", 29));



        SetUsers.add(new User("Petr","m", 15));
        SetUsers.add(new User("Olga","g", 19));

        FindService find = new FindService();

        //find.findUser(ListUsers, "Olev");

        find.findUserByGender(ListUsers, "m");









    }
}
