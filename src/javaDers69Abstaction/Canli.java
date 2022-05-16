package javaDers69Abstaction;

public abstract class Canli {


    //  Abstract olan bir classin icerisinede
// abstract methot olusturabiliriz
String bilgi = "Degerlerde konulabilir";

    public abstract void konus();
    public abstract void solunum();

    public void abstractaCalis(){
        System.out.println("Abstact Class'a" +
                " normal methodlarda konulabilir"
                 );
    }

}
