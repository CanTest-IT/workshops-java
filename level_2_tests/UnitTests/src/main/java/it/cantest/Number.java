package it.cantest;

public class Number {
    private int num;

    public boolean isEven(){
        return this.num%2==0;
    }

    public Number(int num) {
        this.num = num;
    }

    public Number() {
    }

    public void setNum(int num) {
        this.num = num;
    }
}
