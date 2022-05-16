package javaDers96Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Detay {
    public static void main(String[] args) {

        ArrayList<String> isimler = new ArrayList<>();

        isimler.add("Burcu");
        isimler.add("Nesrin");
        isimler.add("Busra");

        System.out.println(isimler);

        ListIterator listIterator = isimler.listIterator();


        System.out.println(listIterator.hasNext());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.previous());
        listIterator.add("Safiye");
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        listIterator.set("Nesrinx");
        System.out.println(listIterator.previous());
        System.out.println(listIterator.previous());
        System.out.println(isimler);
while (listIterator.hasNext()){
    System.out.println(listIterator.next());
}

    }
}
