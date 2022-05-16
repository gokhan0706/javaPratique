package javaDers69Abstaction;

public class MainClass {
    public static void main(String[] args) {
      //  miras olarak aldigimiz ama nese olusturamadigimiz abstract classlarimiz

    Kus nesne1 = new Kus();
  //  Canli nesne2 = new Canli();
        // Abstract class'lardan nesne olusturamazsin
        // Miras alinabilir ama nesne olusturulamaz

        Canli nesne3 = new Kus();
        Canli nesne4 = new Kedi();
        nesne3.konus();
        nesne4.konus();

nesne4.abstractaCalis();
        System.out.println(nesne3.bilgi);
    }
}
