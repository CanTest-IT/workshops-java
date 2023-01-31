package it.cantest.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void shouldCorrectlySumNumbersTest() {
        //given
        int el1=2, el2=4, expected=6;
        Calculator calculator= new Calculator();
        //when
        int result = calculator.sum(el1,el2);
        //then
        Assertions.assertEquals(expected,result,"Incorrect result");
    }

}