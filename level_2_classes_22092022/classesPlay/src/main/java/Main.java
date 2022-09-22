public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("CanTest.it");
        Currency pln = new Currency();
        System.out.println(pln);
        pln.setName("Polski Złoty");
        pln.setCurrencyCode("PLN");
        pln.setCostForOneEuro(4.75);
//        pln.name = "Polski Złoty";
//        pln.currencyCode = "PLN";
//        pln.costForOneEuro = 4.75;
        System.out.println(pln);
        Currency eur = new Currency("Euro","EUR",1.0);
        eur.setCurrencyCode("EUR");
        System.out.println(eur);

        // Currency bad = new Currency("Bad","BAD",-3.14);
        System.out.println(pln.howMuchForGivenEurosMsg(23));

        System.out.println(pln.getName());

        //Matma matma = new Matma();
        System.out.println(Matma.isEven(256));


    }
}
