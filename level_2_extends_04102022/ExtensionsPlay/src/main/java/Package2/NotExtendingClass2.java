package Package2;

import Package1.BaseClass;

public class NotExtendingClass2 {
    public void testy(){
        BaseClass baseClass = new BaseClass();
        //baseClass.protektowany = 2; nie ma dostepu
        baseClass.publiczny = 256;
        // baseClass.zaden = "Aaaa"; nie ma dostepu
        //baseClass.prywatny = 1; nie mamy dostepu
    }


}
