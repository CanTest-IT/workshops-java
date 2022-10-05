package Library;

public class Movie extends Item {

    private String mediaType;
    private String director;

    public Movie(String name, int catalogueNumber,
                 String mediaType, String director) {
        super(name, catalogueNumber);
        this.mediaType = mediaType;
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "mediaType='" + mediaType + '\'' +
                ", director='" + director + '\'' +
                ", name='" + name + '\'' +
                ", catalogueNumber=" + catalogueNumber +
                '}';
    }

    public boolean isRewind() {
        return false;
    }
}
