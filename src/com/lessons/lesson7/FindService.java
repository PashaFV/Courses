package com.lessons.lesson7;

import java.util.*;
import java.util.Collections;

public class FindService implements Comparable <User> {

    public void findUser (Collection<User> collection, String name){



        for (User user : collection){
            if (user.getName() == name){
                System.out.println("Найден пользователь: " + name);
                return;
            }
        }
        System.out.println("Не найден пользователь: " + name);
    }


    public void findUserByGender (Collection<User> collection, String gender) {

        for (User user : collection){
            if (user.getGender() == gender){
                System.out.println("Пользователи с полом : " + collection );

                }
                }

                return;
            }

    @Override
    public int compareTo(User o) {
        return 0;
    }

}
