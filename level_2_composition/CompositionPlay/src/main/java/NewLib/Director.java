package NewLib;

public class Director extends Person{
    private int numberOfMoviesDirected;

    public Director(String name, int birthYear, int numberOfMoviesDirected) {
        super(name, birthYear);
        this.numberOfMoviesDirected = numberOfMoviesDirected;
    }

    @Override
    public String toString() {
        return "Director{" +
                "numberOfMoviesDirected=" + numberOfMoviesDirected +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
