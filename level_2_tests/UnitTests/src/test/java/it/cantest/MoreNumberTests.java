package it.cantest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.beans.PropertyEditorSupport;
import java.time.Month;

public class MoreNumberTests {


    @ParameterizedTest
    @ValueSource(ints = {1, -7, 15, 45, 100, 1025})
    void shouldReturnFalseForOddNumbers(int value) {
        //given
        Number number = new Number(value);
        //when
        boolean result = number.isEven();
        //then
        Assertions.assertFalse(result, "Failed at: " + value);
    }


    @ParameterizedTest
    @CsvSource({"a,A", "A,A", "123,123", "!@#$,!@#$", ","})
    public void shouldGoToUpperCase(String input, String expected) {
        String result = input.toUpperCase();
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/uppers.csv", numLinesToSkip = 1)
    public void shouldGoToUpperCaseFromFile(String input, String expected) {
        String result = input.toUpperCase();
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @EnumSource(Month.class)
    public void testEnum(Month month){
        System.out.println(month);
    }

    @Test
    public void shouldThrowException(){
        Assertions.assertThrows(NumberFormatException.class,
                () ->{Integer.parseInt("test");}) ;

        Assertions.assertDoesNotThrow(()->{Integer.parseInt("123");});

    }

    @Test
    public void shouldParseInt(){
        Assertions.assertEquals(123,Integer.parseInt("AAA"));
    }

}
