package it.cantest;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)     //nie robcie tego
class NumberTest {
    private Number numberDoTestow;
    private String testujemy;    //ani tego


    @Test
    void shouldReturnTrueForEvenNumber() {
        //given
        int liczba = 8 ;
        Number number =  new Number(liczba);
        boolean expected = true;
        //when
        boolean result = number.isEven();
        //then
        Assertions.assertEquals(expected,result);
    }

    @Test
    void shouldReturnTrueForEvenNumberDifferently() {
        //given
        int liczba = 8 ;
        Number number =  new Number(liczba);
        //when
        boolean result = number.isEven();
        this.testujemy = "test123";    //a tego to juz szczegolnie!!
        //then
        Assertions.assertTrue(result,"Miało być parzyste = true, a nie jest!!! dla liczby: "+liczba);
    }

    @Test
    void shouldStillWork() {
        //given
        numberDoTestow.setNum(28);
        //when
        System.out.println(this.testujemy);
        boolean result = this.numberDoTestow.isEven();
        //then
        Assertions.assertTrue(result);
    }

    @BeforeAll
    public static void setUp(){
        System.out.println("Before All");
    }

    @BeforeEach
    public void setUpTest(){
        System.out.println("Before each");
        numberDoTestow = new Number();
    }

    @AfterEach
    public void cleanTest(){
        System.out.println("After Each");
    }

    @AfterAll
    public static void clean(){
        System.out.println("After All");
    }

}