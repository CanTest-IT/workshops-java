import java.util.*;

public class CollectionsTrain {
    public static void main(String[] args) {
        System.out.println("Hello CanTest.it");
        System.out.println("Collections in JAVA!!");

        int liczba1 = 6, liczba2 = 8, liczba3 = 44;
        int[] liczby = {6, 8, 44};
        int inneLiczby[] = {5, 11, 23, 67};

        System.out.println(liczby);
        //System.out.println(inneLiczby[0]);
        for (int i = 0; i < inneLiczby.length; i++) {
            System.out.println(inneLiczby[i]);
        }
        System.out.println(Arrays.toString(inneLiczby));

        Point[] punkty;

        List<String> names = new ArrayList<>();
        names.add("Albert");
        names.add("Wigna");
        names.add("Michal");
        System.out.println(names);
        names.add(1,"Ania");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
        names.remove("Michal");
        System.out.println(names);
        names.remove(2);
        System.out.println(names);
        System.out.println(names.get(1));
        names.add("Kuba");
        names.add("Zenon");

        //wypiszmy wszystkie imiona z names:
        System.out.println("=============1==============");
        for (String imie : names){
            System.out.println(imie);
        }
        System.out.println("=============2==============");
        names.forEach(name -> System.out.println(name)); //wykorzystujemy streamy
        System.out.println("=============3==============");
        int i = 0;
        while (i<names.size()) {
            System.out.println(names.get(i));
            i++;
        }
        System.out.println("=============4==============");
        for(int j=0;j<names.size();j++){
            System.out.println(names.get(j));
        }

        List<Integer> numery = new LinkedList<>();
        numery.add(2);
        numery.add(3);
        numery.add(5);
        numery.add(7);
        numery.add(11);
        numery.add(2);

        System.out.println(numery);

        HashSet<String> dniTygodnia = new HashSet<>();
        dniTygodnia.add("Poniedzialek");
        dniTygodnia.add("Wtorek");
        dniTygodnia.add("Sroda");
        dniTygodnia.add("Czwartek");
        dniTygodnia.add("Piatek");
        dniTygodnia.add("Sroda");
        System.out.println(dniTygodnia);

        for (String s:dniTygodnia        ) {
            System.out.println(s+" "+s.hashCode());
        }

        System.out.println(dniTygodnia.contains("Piatek"));

        Customer customer1 = new Customer(1, "Pinokio");
        Customer customer2 = new Customer(33, "Antek");
        Customer customer3 = new Customer(43, "Pluto");

        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer1);
        System.out.println(customers.size());
        System.out.println(customers);

        HashSet<Customer> customers1 = new HashSet<>();
        customers1.add(customer1);
        customers1.add(customer2);
        customers1.add(customer3);
        customers1.add(customer1);
        System.out.println(customers1.size());
        System.out.println(customers1);
        // istnieja tez LinkedHashSet i TreeSet

        int[][] tablica2d = new int[3][3];
        tablica2d[0][0] = 5;

        HashMap<Integer,String> kodyPocztowe = new HashMap<>();
        kodyPocztowe.put(19, "Koluszki");
        kodyPocztowe.put(28,"Wroclaw");

        System.out.println(kodyPocztowe);
        kodyPocztowe.put(28, "Kielce");
        System.out.println(kodyPocztowe);
        System.out.println(kodyPocztowe.get(19));

        HashMap<String,String> osoba = new HashMap<>();
        osoba.put("Imie","Wieslaw");
        osoba.put("Nazwisko","Golas");
        osoba.put("Wiek","56");
        osoba.put("Zwierze","Pies");

        System.out.println(osoba.get("nazwisko"));
        System.out.println(osoba.containsKey("nazwisko"));
        System.out.println(osoba.containsValue("Pies"));

        HashMap<Integer,Customer> klienci = new HashMap<>();
        klienci.put(1,customer1);
        klienci.put(3,customer2);
        klienci.put(77,customer1);
        klienci.put(5,customer3);
        System.out.println(klienci.size());
        System.out.println(klienci);
        klienci.replace(77,new Customer(888,"Kowalski"));
        System.out.println(klienci);
        //Istnieja tez TreeMap

        Integer[] tablicaNowa = {1,2,3,4};
        List<Integer> listaNowa = Arrays.asList(tablicaNowa);
        System.out.println(listaNowa);
    }

    class Point{
        int x,y;
    }
}
