package it.cantest.stringi;

import java.util.Scanner;

public class Main {
        static String poleKlasy = "nie null";

        public static void main(String[] args) {
                int zmienna = 456;
                //String zmienna = "456";
                int liczba = 14;
                String tekst = "tralalal";
                System.out.println(tekst+zmienna+liczba);
                System.out.println(zmienna+liczba+tekst);
                System.out.println(""+zmienna+liczba+tekst);

                System.out.print("napis jakiś\n");
                System.out.println("jeszcze jakiś napis");

                //zmienna z powitaniem
                //zmienna z imieniem
                //wypisac razem

                String powitanie = "Cześć mam na imię ";
                String imie = "Kuba";
                System.out.println(powitanie+imie);
                System.out.println("Siemasz "+imie);

                System.out.println(poleKlasy);

                String zmienna1 = "bec";
                String zmienna2 = zmienna1;

                zmienna1 = "hop";

                System.out.println(zmienna1+zmienna2);

                Scanner scanner = new Scanner(System.in);
                System.out.println("Jakie jest Twoje ulubione zwierze?");
                String ulubioneZwierze = scanner.nextLine();
                System.out.println("Ojej, "+ulubioneZwierze+" to tez moj ulubiony gatunek");

                // %s - string %d - liczba calkowita %f - liczba przecinkowa
                String caleZwierze = String.format("Ojej, %s to tez moj ulubiony gatunek, ale razy %d!",ulubioneZwierze,3000);
                System.out.println(caleZwierze);

                System.out.println(    caleZwierze.charAt(6)   );

                zmienna1 = "tak";
                zmienna2 = "nie";
                zmienna1.equals(zmienna2);
                System.out.println(zmienna1==zmienna2);

                System.out.println(hackerizeMe("JESTEM WESOLY ROMEK I ZIUTEK"));

                String tekstWielkimi = "TRALALALA";
                tekstWielkimi.toLowerCase();
                String tekstMalymi = tekstWielkimi.toLowerCase();
                System.out.println(tekstWielkimi);
                System.out.println(tekstMalymi);

                String liczbaNowa = "1024";
                int calkiemNowaLiczba = Integer.parseInt(liczbaNowa);

                System.out.println(liczbaNowa);
                System.out.println(calkiemNowaLiczba);
        }

        static String hackerizeMe(String text){
                //e->3, a->4, o->0, i->1
                //toLowerCase(), replace()
             return text.toLowerCase().replace("e","3").replace("a","4")
                     .replace("o","0").replace("i","1");
        }
            
}

