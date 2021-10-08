package com.lessons.lesson8;

import java.util.Scanner;

public class main8 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        DataService service = new LocalMemoryDataService();


        while (true) {

            String next = scanner.next();
            if ("exit".equals(next)){
                break;
            }else if ("get".equals(next)){
                try {
                    System.out.println(service.get());
                } catch (NoElementEx e) {
                    System.out.println("No element");
                }


            }else {
                try {
                    service.add(next);
                } catch (LowMemoryEx e){
                    System.out.println("Memory full");
                }

            }


        }

    }
}
