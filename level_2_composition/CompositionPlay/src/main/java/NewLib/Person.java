package NewLib;

public abstract class Person {
    protected String name;
    protected int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }
}
