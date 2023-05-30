package it.canTest;

public class Throwing {

    public static void main(String[] args) {
        System.out.println(isAdult(-44));
    }

    public static boolean isAdult(int age){
        if(age<0)throw new KubaZepsulException("Age cannot be negative");
        return age>=18;
    }


}
