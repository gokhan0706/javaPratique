package javaDers32;

public class ArraySayiToplami {
    public static void main(String[] args) {

        int[] sayilar = {1,2,3,4,5,6,7};
        int sum =0;
        int num=0;
        while (num<sayilar.length){
            sum =sayilar[num]+sum;
       num++;
        }
        System.out.println(sum);

    }
}
