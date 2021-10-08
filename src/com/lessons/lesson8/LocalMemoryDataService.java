package com.lessons.lesson8;

import java.util.ArrayList;
import java.util.List;

public class LocalMemoryDataService implements DataService{

    private List<String> list = new ArrayList<>();

    @Override
    public void add(String text) throws LowMemoryEx {
        if (list.size() > 4 ){
            throw new LowMemoryEx();
        } else {
            list.add(text);
        }

    }

    @Override
    public String get() throws NoElementEx {
        if (list.size() <1){
            throw new NoElementEx();
        }else {
            return list.remove(0);
        }

    }
}
