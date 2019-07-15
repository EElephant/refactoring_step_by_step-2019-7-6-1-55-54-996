package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DriverTest {

    private Driver driver;

    @BeforeEach
    public void initDirver(){
        driver = new Driver();
    }

    @Test
    public void should_return_true_when_call_isLegalDriver_when_given_age_is_19(){
        //given
        driver.setAge(19);

        //when
        boolean result = driver.isLegalDriver();

        //then
        Assertions.assertEquals(true,result);
    }

    @Test
    public void should_return_true_when_call_isLegalDriver_when_given_age_is_18(){
        //given
        driver.setAge(18);

        //when
        boolean result = driver.isLegalDriver();

        //then
        Assertions.assertEquals(true,result);
    }

    @Test
    public void should_return_false_when_call_isLegalDriver_when_given_age_is_17(){
        //given
        driver.setAge(17);

        //when
        boolean result = driver.isLegalDriver();

        //then
        Assertions.assertEquals(false,result);
    }
}
