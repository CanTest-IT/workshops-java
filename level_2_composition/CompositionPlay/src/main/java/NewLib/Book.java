package NewLib;

public class Book extends Item{
    private String title;
    private Author author;

    public Book(String isbn, String title, Author author) {
        super(isbn);
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
