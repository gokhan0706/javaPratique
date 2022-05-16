package javaDers29;

import java.util.Arrays;

public class Pratik01 {

    public static void main(String[] args) {
        //  Lutfen isimlerden olusan bir array listesi olusturunuz


        String[] array1 = new String[5];


        array1[0]="Gokhan";
        array1[1]="salih";
        array1[2]="yusuf ali";
        array1[3]="Sule";
        array1[4]="ozlem";


        // 2. yontem

        String[] array2= {"Ismet","Mahmud", "Mesut","Cihan"};

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));


    }
}
