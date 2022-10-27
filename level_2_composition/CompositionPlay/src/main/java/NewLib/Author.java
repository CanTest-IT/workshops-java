package NewLib;

public class Author extends Person{
    private String firstPublication;

    public Author(String name, int birthYear, String firstPublication) {
        super(name, birthYear);
        this.firstPublication = firstPublication;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstPublication='" + firstPublication + '\'' +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
