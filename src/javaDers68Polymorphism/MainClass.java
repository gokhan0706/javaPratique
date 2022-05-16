package javaDers68Polymorphism;

public class MainClass {

    public static void main(String[] args) {


        Hayvan hayvan1 = new Hayvan();
        Kedi hayvan2 =new Kedi();
        Hayvan hayvan3 = new Kedi(); //Ata olan class'in alt class
                                    // gibi davranmasidir.
        hayvan1.konus();
        hayvan3.konus();


    }
}
