package Library;

public class Library {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello cantest.it");

        //dla klasy abstrakcyjnej ponizsze nie zadziala
        //Item item1 = new Item("Książka",111);
        //System.out.println(item1);

        Book book = new Book("Pan Tadeusz",
                222,
                "Adam Mickiewicz");
        System.out.println(book);
        //System.out.println(item1.status());
        System.out.println(book.status());

        Movie movie1 = new Movie("Rambo",333,
                "VHS","Nie Wiemy");
        System.out.println(movie1);
        System.out.println(movie1.isRewind());

        Item jakisElement = new Book("365 dni",666,
                "Blanka Lipinska");
        System.out.println(jakisElement);
             // polimorfizm
        Item innyItem = new Movie("365 dni",667,
                "Streaming","Nie chcemy wiedziec");
        System.out.println(innyItem);

        ComicBook comicBook = new ComicBook("Antresolka Profesorka",
                213,"Tadeusz Baranowski",
                "Tadeusz Baranowski");
        System.out.println(comicBook);

        comicBook.rent();
        System.out.println(comicBook.getRentedDate());
        //comicBook.rent();



        }
}
