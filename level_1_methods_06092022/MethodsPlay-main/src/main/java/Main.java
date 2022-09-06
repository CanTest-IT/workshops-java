public class Main {

    public static void main(String[] args) {
        String naszTekst = "Hello CanTest.it";
        wyp(naszTekst);             //wywolanie metody wyp
        nic();
        System.out.println(isEven(256));
        System.out.println(
                dajPunkt(13, -8)
        );
        System.out.println(
                odleglosc(dajPunkt(5, -3))
        );
        System.out.println(maksymalna(3, 5, 4));
        System.out.println(maksymalna(67,987));
        System.out.println(NWW(1,20,3,7));
        jakisTekst("ALA");
        jakisTekst("Tralalala");
    }

    //matoda przyjmuje 3 liczby calkowite, zwraca najwieksza
    public static int maksymalna(int x, int y, int z) {
        int max = x;
        if (y > max) max = y;
        if (z > max) return z;
        else return max;
    }
    //matoda przyjmuje 2 liczby calkowite, zwraca najwieksza, nazywa sie maksymalna()
    public static int maksymalna(int x, int y){
        Math.max(4,6);
        if(x>y)return x;
        else return y;
    }

    //z zadanego zakresu min/max znajdzie NWW podanych liczb x i y
    public static int NWW(int min, int max, int x, int y){
        for(int i=min;i<=max;i++){
            if(i%x==0 && i%y==0)return i;
        }
        return -1;
    }


    private static void wyp(String bleble) {
        System.out.println(bleble);
        nic();
    }

    private static void nic() {
        System.out.println("Nic!");
    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }

    private static Punkt dajPunkt(int wspolrzednaPoczatkowaX, int wspolrzednaPoczatkowaY) {
        Punkt punkt = new Punkt();
        punkt.x = wspolrzednaPoczatkowaX;
        punkt.y = wspolrzednaPoczatkowaY;
        return punkt;
    }

    private static double odleglosc(Punkt punkt) {
        return Math.sqrt(punkt.x * punkt.x + punkt.y * punkt.y);
    }

    private static void jakisTekst(String text){
        if(text.length()<5) {
            return;       //return zarowno zwraca, jak i wychodzi z metody
        }
        System.out.println(text);
    }

    static class Punkt {
        int x, y;

        @Override
        public String toString() {
            return "Punkt{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
