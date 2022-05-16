package javaDers29;

public class ParagrafParcala {
    public static void main(String[] args) {

        String paragraf = "Yerli yardımcı konusunda adı geçen ilk ismin de Ahmet Dursun olduğu ifade edildi. Bu gelişmenin hemen ardından Ahmet Dursun'un son yaptığı paylaşım dikkat çekti. Beşiktaş'ın eski golcüsü, Beşiktaş formalı fotoğrafını paylaşıp \"Yakında\" yazarken bu ifade kafaları karıştırdı. Dursun'un yanı sıra" +
                " İlhan Mansız ismi de ortaya atılırken önümüzdeki günlerde yerli yardımcı konusunun netleşmesi bekleniyor.";


        String[] cumle = paragraf.split("\\.");

        System.out.println(cumle.length + " ");


        for (int i=0;i<cumle.length;i++){
            System.out.println(cumle[i]);
        }


        String[] kelime = paragraf.split("\\ ");
        System.out.println("KELIMELER*****\\n");
        System.out.println(kelime.length);
        for (int i=0;i<kelime.length;i++){
            System.out.println(kelime[i]);
        }

        String[] karakter = paragraf.split("");
        System.out.println("karakterler*****\\n");
        System.out.println(karakter.length);
        for (int i=0;i<karakter.length;i++){
            System.out.println(karakter[i]);
        }
    }
}
