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



    public void findUserByGender (Collection<User> collection) {


        for (User user : collection) {
            if (user.getGender().contains("m")) {
                System.out.println(user);

            }
            }

        }



        @Override
        public int compare (User o1, User o2){
            if (o1.getAge() == o2.getAge()) {
                return 0;

            }
            return o1.getAge() < o2.getAge() ? -1 : 1;

        }



    }







