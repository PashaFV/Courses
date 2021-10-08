package com.lessons.lesson8;

public interface DataService {

    void add (String text) throws LowMemoryEx;

    String get () throws NoElementEx;

}
