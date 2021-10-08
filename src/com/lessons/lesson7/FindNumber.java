package com.lessons.lesson7;

import java.util.HashMap;
import java.util.Map;

public class FindNumber {

    public static void  arrNumbers (){

        int [] arr = {7,4,3,7,5,7,1,8};

        Map<Integer,Integer> integersCount = new HashMap<Integer,Integer>();

        for (Integer i : arr){
            if (!integersCount.containsKey(i))
                integersCount.put(i, 1);
            else
                integersCount.put(i, integersCount.get(i) + 1);
        }
        System.out.println(integersCount);








    }

}
