package javaDers29;

public class SplitMethodu {
    public static void main(String[] args) {
       String yapilacaklar ="temizlik,utu,tamir,paspas";
       String[] array = yapilacaklar.split(",");
       for (int i=0;i<array.length;i++){
           System.out.print(array[i]);
       }
    }
}
