import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello number " + 6);

        //co mozemy robic z liczbami?
        // przechowywac!
        // dzialania -> matematyczne: dodawanie, odejmowanie, reszta z dzielenia
        // porównywać!!!

        int liczba = 2147483647; //typ prymitywny - przechowuje "tylko" wartosc
        Integer obiektLiczba;
        //short, int, long   max int 2147483647
        Short malaLiczba;  //~32000
        System.out.println(liczba);
        liczba++;
        System.out.println(liczba);


        int nowaLiczba = 1;
        System.out.println(nowaLiczba++);
        System.out.println(nowaLiczba);
        System.out.println(++nowaLiczba);

        nowaLiczba = nowaLiczba + 5;
        nowaLiczba += 5; // -=, *=, /=
        System.out.println(nowaLiczba);
        nowaLiczba /= 2;
        System.out.println(nowaLiczba);

        //typy ulamkowe
        float malyUlamek = 12.5f;
        double duzyUlamek = 2 / 3d;
        System.out.println(malyUlamek);
        System.out.println(duzyUlamek);
        System.out.printf("%.4f \n", duzyUlamek);
        System.out.printf("%.4f \n", malyUlamek);

        malyUlamek = 2 / 3f;
        System.out.println(malyUlamek);
        //UWAGA na porownania liczb ulamkowych

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int wiek = scanner.nextInt();
        if (wiek >= 18) {
            System.out.println("Zapraszam na kielicha!");
        } else {
            System.out.println("Cukiereczek dla Ciebie!");
        }

        // >, <, >=, <=,
        if (wiek == 18) {
            System.out.println("I witamy wsrod doroslych");
        }

        if (!isEven(wiek)) {
            System.out.println("Ale masz nieparzysty wiek!");
        }

        String wiekNapis = "19";
        int wiekZNapisu = Integer.parseInt(wiekNapis);
        wiekZNapisu++;
        System.out.println(wiekNapis + " " + wiekZNapisu);

        String liczbaTrudnaTekst = "12.234.345";
        liczbaTrudnaTekst = liczbaTrudnaTekst.replace(".","");
        int liczbaTrudna = Integer.parseInt(liczbaTrudnaTekst);
        System.out.println(++liczbaTrudna);

        BigInteger bigInteger = new BigInteger("999999999999999999999999999999999999999");
        BigInteger bigInteger1 = new BigInteger("999999999999999999999999999999999999999");

        System.out.println(bigInteger1 == bigInteger);  // to daje false bo porownuje adresy w pamieci
        System.out.println(bigInteger.equals(bigInteger1));

        float a = 4.8f;
        int b = 6;
        float c = a + b;

        int d = (int)a + b;

        System.out.println(c);
        System.out.println(d);

    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
//        ponizej to samo, tylko inaczej
//        if (n % 2 == 0) {
//            return true;
//        }
//        return false;
    }

}
