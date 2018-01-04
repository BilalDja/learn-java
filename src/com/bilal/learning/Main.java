//package com.bilal.learning;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//
//    private static List<Integer> numbers = new ArrayList<>();
//
//    public static void main(String[] args) {
//        add(1);
//        showList();
//    }
//
//    static void add(int x) {
//        numbers.add(x);
//    }
//
//    static void showList() {
//        for (int x : numbers) {
//            System.out.println(x);
//        }
//    }
//
//}

package com.bilal.learning;

public class Main {
    public static void main(String[] args) {
        ArmyStore store = new ArmyStore();
        store.add(new Soldier());
        store.add(new Doctor());
        store.add(new Driver());
        store.armyInfo();
    }
}
