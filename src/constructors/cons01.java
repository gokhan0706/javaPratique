package constructors;

public class cons01 {
int price = 1000;
int model = 1999;


    public cons01(){

    }
    public cons01(int price){
        this.price=price;
    }
    public static void main(String[] args) {

      cons01 arac1=new cons01();

        System.out.println(arac1.model);


    }
}
