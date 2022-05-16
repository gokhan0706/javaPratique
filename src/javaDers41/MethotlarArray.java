package javaDers41;

public class MethotlarArray {
    public static void main(String[] args) {

        int[] syl ={3,4,5,6,7,8,9};
        System.out.println(arrayToplama(syl));

        System.out.println(arrayToplama(new int[] {5,6,7,8,}));
    }

    public static int arrayToplama(int[] sayilar){
        int sum =0;
        for (int sayi:sayilar){
            sum+=sayi;

        }

        return sum;
    }


}
