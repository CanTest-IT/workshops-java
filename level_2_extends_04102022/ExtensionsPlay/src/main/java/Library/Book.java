package Library;

public class Book extends Item{
    protected String author;

    public Book(String name, int catalogueNumber, String author) {
        super(name, catalogueNumber);   // to jest konstruktor klasy nadrzednej
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", catalogueNumber=" + catalogueNumber +
                '}';
    }

    public String status(){
        return "Wolna";
    }


    public void cokolwiek(){
        System.out.println("Cokolwiek");
    }



}
