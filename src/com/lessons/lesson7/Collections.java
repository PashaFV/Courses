package com.lessons.lesson7;

import java.util.*;

public class Collections {
    public static void main(String[] args){

        List<User> ListUsers = new ArrayList<>();
        Set<User> SetUsers = new TreeSet<>();

        ListUsers.add(new User("Pavel","m", 68));
        ListUsers.add(new User("Ivan","g", 24));
        ListUsers.add(new User("Oleg","g", 29));



        SetUsers.add(new User("Petr","m", 15));
        SetUsers.add(new User("Olga","g", 19));
        SetUsers.add(new User("Ivan","m", 45));

        FindService find = new FindService();

        //find.findUser(ListUsers, "Olev");

        //find.findUserByGender(ListUsers);

        java.util.Collections.sort(ListUsers, new FindService());
        System.out.println(ListUsers);













    }
}
