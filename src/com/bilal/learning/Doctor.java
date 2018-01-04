package com.bilal.learning;

public class Doctor implements Person {
    @Override
    public String speak() {
        return "Hi, I'd like to fix you";
    }

    @Override
    public String attack() {
        return "Sorry, I don't attack people!";
    }
}
