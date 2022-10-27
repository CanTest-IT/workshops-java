package NewLib;

import java.util.ArrayList;
import java.util.List;

public class NewLibrary {
    public static void main(String[] args) {
        System.out.println("Welcome to the new CanTest.it library");

        Director dir1 = new Director("Juliusz Machulski",
                1948,15);
        Actor act1 = new Actor("Jerzy Stuhr",1950,
                "Szkola Aktorska");
        Actor act2 = new Actor("Cezary Pazura",1955,
                "13 posterunek");

        Movie mov1 = new Movie("1234","Niekonczaca sie opowiesc",
                dir1);
        System.out.println(mov1);
        mov1.addActor(act1);
        mov1.addActor(act2);
        System.out.println(mov1);

        mov1.addActor(new Actor("Pies Pluto",
                1920,"Mickey Mouse"));

        System.out.println(mov1);

        //przekazywanie przez wartosc
        int a = 4;
        int b = a; // java daje b liczbe 4

        a=6;

        System.out.println(b);

        //przekazywanie przez referencje
        Actor c = new Actor("Adam",1234,"AAA");
        Actor d = c;   // java daje d "tylko" adres Aktora c

        c.setName("Bogdan");
        System.out.println(d);


        Book book1 = new Book(
               "4321",
                "O psie, ktory jezdzil koleja",
                new Author("Adam Mickiewicz",1734,
                        "Sonety Krymskie")
        );

        System.out.println(book1);

        List<Book> books = new ArrayList<>();
        List<Movie> movies = new ArrayList<>();

        books.add(book1);
        movies.add(mov1);

        System.out.println(books);
        System.out.println(movies);

        List<Item> items = new ArrayList<>();
        items.add(book1);
        items.add(mov1);

        System.out.println(items);


    }




}
