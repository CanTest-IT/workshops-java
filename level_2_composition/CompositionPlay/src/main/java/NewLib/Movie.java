package NewLib;

import java.util.ArrayList;
import java.util.List;

public class Movie extends Item{
    private String title;
    private Director director;
    private List<Actor> actors;

    public Movie(String isbn, String title, Director director) {
        super(isbn);
        this.title = title;
        this.director = director;
        this.actors = new ArrayList<>();
    }

    public void addActor(Actor actor){
        this.actors.add(actor);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director=" + director +
                ", actors=" + actors +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
