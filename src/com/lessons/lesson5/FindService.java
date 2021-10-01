package com.lessons.lesson5;

public class FindService implements FindServ {

    @Override
    public boolean findempl(Director dir, String name) {
        return FindServ.super.findempl(dir, name);
    }
}
