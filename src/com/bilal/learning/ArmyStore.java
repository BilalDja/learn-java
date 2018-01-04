package com.bilal.learning;

import java.util.ArrayList;
import java.util.List;

public class ArmyStore {

    private List<Person> army = new ArrayList<>();

    public void add(Person p) {
        army.add(p);
    }

    public void armyInfo() {
        for (Person p : army) {
            System.out.println(p.speak());
            System.out.println(p.attack());
        }
    }

}
