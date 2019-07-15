package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PoliceTest {

    private Police police;

    @BeforeEach
    public void init(){
        police = new Police();
    }

    @Test
    public void should_return_true_when_Police_call_checkDriver_given_Driver_age_more_than_18(){
        //given
        Driver driver = new Driver(19);

        //when
        boolean result = police.checkDriver(driver);

        //then
        Assertions.assertEquals(true,result);
    }

    @Test
    public void should_return_true_when_Police_call_checkDriver_given_Driver_age_equal_to_18(){
        //given
        Driver driver = new Driver(18);

        //when
        boolean result = police.checkDriver(driver);

        //then
        Assertions.assertEquals(true,result);
    }


    @Test
    public void should_return_false_when_Police_call_checkDriver_given_Driver_age_less_than_18(){
        //given
        Driver driver = new Driver(17);

        //when
        boolean result = police.checkDriver(driver);

        //then
        Assertions.assertEquals(false,result);
    }

}