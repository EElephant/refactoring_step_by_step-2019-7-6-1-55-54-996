package com.tws.refactoring;

public class Driver {
    private int age;
    private static final int LEGAL_AGE = 18;


    public boolean isLegalDriver() {
        return this.age >= LEGAL_AGE;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
