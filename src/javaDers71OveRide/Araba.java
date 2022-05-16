package javaDers71OveRide;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Araba extends AbstractMethod{
    public void hareket(){
        System.out.println("Araba hareket ediyor");
    }

    public void calistir(){
        System.out.println("Araba calisiyor");
    }

    @Override    // Burada AbstractMethodu miras aldigim icin OVerride etmek zorundayim
    public void SoyutClass() {

    }
}
