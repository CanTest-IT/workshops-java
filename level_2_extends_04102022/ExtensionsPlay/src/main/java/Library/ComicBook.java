package Library;

public class ComicBook extends Book {
    private String artist;

    public ComicBook(String name, int catalogueNumber,
                     String author, String artist) {
        super(name, catalogueNumber, author);
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "ComicBook{" +
                "artist='" + artist + '\'' +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", catalogueNumber=" + catalogueNumber +
                '}';
    }
}
