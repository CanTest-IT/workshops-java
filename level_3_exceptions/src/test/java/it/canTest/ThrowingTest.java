package it.canTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.NotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class ThrowingTest {

    @Test
    @DisplayName("IsAdult")
    void shouldThrowExceptionForNegativeAge() {
        //given
        int age = -7;
        //when
        //then
        Assertions.assertThrows(KubaZepsulException.class,
                ()->{
            Throwing.isAdult(age);
                });
    }
}