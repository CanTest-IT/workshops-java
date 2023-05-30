package it.canTest;

public class KubaZepsulException extends RuntimeException{

    //robienie wlasnych wyjatkow nie jest dobra praktyka!
    public KubaZepsulException(String tekst){
        super(tekst);
    }
}
