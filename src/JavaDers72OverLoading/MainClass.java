package JavaDers72OverLoading;

public class MainClass {
    public static void main(String[] args) {

        MainClass method = new MainClass();
        System.out.println(method.toplama(23,45));
        method.toplama(23,45,66);

        toplama(12,34,65,343);  // Bu method static oldugu icin nesne olusturmadan direct yazabildik

    }




    public int toplama(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public int toplama(int sayi1,int sayi2,int sayi3){
        int toplam = sayi1+sayi2+sayi3;
        System.out.println("Uc sayinin toplami = "+ toplam);
        return toplam;// return en sonda olur cunku returnde metdun ci biter asagiya gitmez
    }


    public static int toplama(int sayi1,int sayi2,int sayi3,int sayi4){
        int toplam = sayi1+sayi2+sayi3+ sayi4;
        System.out.println("Dort sayinin toplami = "+toplam);
        return toplam;
    }
}
