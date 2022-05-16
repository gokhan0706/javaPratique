package javaDers78ArrayList;

import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {

        ArrayList isimler  = new ArrayList();

        isimler.add("Gokhan");  isimler.add("Yunus Salih"); isimler.add("Yusuf Ali");  // EKLEME YAPMAK ICIN

        boolean VarMi =  isimler.contains("Yunus Salih");           // "Yunus Salih"  varmi yokmu soyluyor

        isimler.indexOf("Gokhan");                                  //  Gokhan 'in hangi index'te oldugunu soyluyor

        isimler.toArray();                                         // Elinzdeki birArraylisti arraya cevirmek icin

        isimler.set(0,"Sule");                                      // 0'inci indexteki Gokhani Sule yapar

        isimler.get(2);                                              // IKINCI INDEXTEKI YUSUF ALI  YAZDIRILIR

        isimler.remove(0);                                     //SIFINCI INDEKSTEKI GOKHAN SILINDI

        isimler.size();                                             //  ARRAYLIST'IN UZUNLUGU CIKTI

        isimler.clear();                                            // ARRAYLISTE BULUNAN HERSEY SILINIDI

        isimler.isEmpty();                                         // Array list bsmu ona bakiyor




    }
}
