package Package1;

public class NotExtendingClass {
    public void testy(){
        BaseClass baseClass = new BaseClass();
        baseClass.protektowany = 2;
        baseClass.publiczny = 256;
        baseClass.zaden = "Aaaa";
        //baseClass.prywatny = 1; nie mamy dostepu
    }
}
