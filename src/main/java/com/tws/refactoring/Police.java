package com.tws.refactoring;

public class Police {
    public boolean checkDriver(Driver driver) {
        if(driver.age >= 18) return true;
        else return false;
    }
}