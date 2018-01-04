package com.bilal.learning;

public class Driver implements Person {
    @Override
    public String speak() {
        return "Vrom vrom I can ride you where you want!";
    }

    @Override
    public String attack() {
        return "Nop!";
    }
}
