package javaDers80LinkedList;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        LinkedList<String>  isimler =new LinkedList<>();

        List<String> isimler1 =new LinkedList<>();

        isimler.add("ali");
        isimler.add("mahmut");
        isimler.add("kamil");

        System.out.println(isimler.toString());
        System.out.println(isimler);

        for (String isim:isimler
             ) {
            System.out.println(isim);

        }

        HashSet<Object>list =new HashSet<>();//object olarak  deger kullanirsak  hem string hem Integer i
        // icine koyabiyoruz.   Ama for ile kullanamam

        list.add("kazim");
        list.add(100);

        System.out.println(list);//[100, kazim]
    }
}
