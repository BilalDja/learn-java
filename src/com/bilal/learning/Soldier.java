package com.bilal.learning;

public class Soldier implements Person {

    @Override
    public String speak() {
        return "Hi, I'm a soldier";
    }

    @Override
    public String attack() {
        return "Rifle Attack!";
    }

    public void move(int distance) {
        System.out.println("I moved" + distance + " meters");
    }
}
