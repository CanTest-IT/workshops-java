package it.canTest;

import org.openqa.selenium.NotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(metoda1());
        }catch (NotFoundException notFoundException){
            System.out.println("Zlapalem wyjatek: "+notFoundException);
        }catch (Exception e){
            System.out.println("Tralalal");
        }finally {
            System.out.println("Tu koncze!");
        }
    }

    public static int metoda1(){
        System.out.println("Metoda 1");
        return metoda2();
    }

    public static int metoda2(){
        System.out.println("Metoda 2 ");
        return 4/0;
    }
}