package javaDers96Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<String> isimler = new ArrayList<>();

        isimler.add("Burcu");
        isimler.add("Nesrin");
        isimler.add("Busra");

        System.out.println(isimler);

        Iterator iterator = isimler.iterator();   // Burada iterator isimler ArrayListinin icne girdi
        // COnsola yazdirma While Loopile klayca yapilabiliyor
        System.out.println("             ********************************************");


        while (iterator.hasNext()){//iterator.hasNext()  yani bir sonraki data varmi sorusuna true cevabini aldigin muddetce dondur
            System.out.println(iterator.next());
        }
        System.out.println("            ******************************************************");
        System.out.println(iterator.hasNext());// sonraki data var mi?(Ilk dataya bakar var mi diye)
      //  iterator.remove(); // uzerinde gectigi yani bulundugu yerdenbir onceki elemani siler
       // System.out.println(iterator.next());   // Birinci dataya gidiyor   Burcu
       // System.out.println(iterator.next());   // ikinci dataya gidiyor     nesrin
      //  System.out.println(iterator.next());   // ucuncu dataya gidiyor  busra
      //  System.out.println(iterator.next());  Bunu yaparsam hata verir cunku bulundugu noktada sora birsey yok




     }


}
