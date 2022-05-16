package javaDers41;

import java.util.Scanner;

public class ArraydaVarMi {

    public static void main(String[] args) {
        String alinan ="al";
        String[] kel={"ali","veli"};
        varMi(kel,alinan);


    }

    public static void varMi(String[] kelimeler, String kelime) {
    boolean varmi =false;
        for (int i = 0; i < kelimeler.length; i++) {
            if (kelimeler[i].equals(kelime)) {
                varmi=true;           }
            }
        System.out.println(varmi);





    } }

