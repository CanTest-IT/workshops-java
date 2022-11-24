package it.cantest;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Order {



    @Test
    @org.junit.jupiter.api.Order(1)
    void test1() {
        //given

        //when
        System.out.println("test1");
        //then

        //DOBRE TESTY MAJA ASERCJE!!
    }

    @Test
    @org.junit.jupiter.api.Order(2)
    void test2() {
        //given

        //when
        System.out.println("Test2");
        //then
    }

    @Test
    @org.junit.jupiter.api.Order(3)
    void test3() {
        //given

        //when
        System.out.println("Test3");
        //then
    }


    @Test
    @org.junit.jupiter.api.Order(4)
    void aten(){

        System.out.println("A ten test?");
    }
}
