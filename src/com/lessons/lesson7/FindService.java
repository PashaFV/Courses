package com.lessons.lesson7;

import java.util.*;
import java.util.Collections;


public class FindService implements Comparator<User>{



    public void findUser (Collection<User> collection, String name){



        for (User user : collection){
            if (user.getName() == name){
                System.out.println("Найден пользователь: " + name);
                return;
            }
        }
        System.out.println("Не найден пользователь: " + name);
    }


    public void findUserByGender (List<User> ListUsers, String gender) {

                Iterator<User> iterator = ListUsers.iterator();
                while (iterator.hasNext()) {
                    if (gender != "g") {
                        System.out.println(iterator.next());
                    }
                    }
                }


    @Override
    public int compare(User o1, User o2) {
        if (o1.getAge() == o2.getAge()) {
            return 0;
        }
        return o1.getAge() < o2.getAge() ? -1 : 1;
    }
}



