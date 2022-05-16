package javaDers64Encapsulation;


public class MainClass {
    public static void main(String[] args) {

        Ogretmen nesne = new Ogretmen();

       // System.out.println(nesne.brans); Bu sekilde brans datasina ulasamam cunku private
       // System.out.println(nesne.dogumTarihi);
        //System.out.println(nesne.kimlikNo);
        System.out.println(nesne.getBrans());
        System.out.println(nesne.getDogumTarihi());
   //     System.out.println(nesne.getKimlikNo());  Kimlik numarasini disariya amak istemiyorum
//  get methodu yontemi ile datalari cagirabilirim ama degistiremem
    }

    // Data saklama diyebiliriz
    // Disaridan ulasilmasini istemedigimiz datayi private yapariz
// //Default ve public te clasdisindan datayi degistirebilirim bile ama privatede goremem


}
