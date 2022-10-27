package NewLib;

public class Actor extends Person{
    private String firstAppearance;

    public Actor(String name, int birthYear, String firstAppearance) {
        super(name, birthYear);
        this.firstAppearance = firstAppearance;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "firstAppearance='" + firstAppearance + '\'' +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
