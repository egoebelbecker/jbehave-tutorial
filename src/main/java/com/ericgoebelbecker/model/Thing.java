package com.ericgoebelbecker.model;

import java.util.ArrayList;

public class Thing {

    private ArrayList<String> theThings = new ArrayList<>();

    public Thing() {
    }

    public Thing(String name) {
        theThings.add(name);
    }


    public void addThing(String name) {
        theThings.add(name);
    }

    public int getThingCount() {
        return theThings.size();
    }

    public boolean hasThing(String name) {
        return theThings.contains(name);
    }
}
