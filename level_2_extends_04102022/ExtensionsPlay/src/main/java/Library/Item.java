package Library;

import java.util.Date;

public abstract class Item {
    protected String name;
    protected int catalogueNumber;
    protected boolean isRented;
    protected Date rentedDate;

    public Date getRentedDate() {
        return rentedDate;
    }

    public void rent() throws Exception{
        if(!isRented){
             this.isRented = true;
             rentedDate = new Date();
        }else{
            throw new Exception("juz wypozyczone");
        }
    }

    public Item(String name, int catalogueNumber){
        this.name = name;
        this.catalogueNumber = catalogueNumber;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", catalogueNumber=" + catalogueNumber +
                '}';
    }

    public String status(){
        return "Wypozyczony";
    }
}
