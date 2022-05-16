package javaDers32;

public class IsiKacDEfa {
    public static void main(String[] args) {

        String[]  isimler = {"Hamza","hakan","mehmet","Hamza","Hamza","mehmet"};
    int sum =1;
        for (int i=0;i<isimler.length;i++){
          for (int j=i+1;j<isimler.length;j++){
              if (isimler[i].equals(isimler[j])) {
                  System.out.println(isimler[i]);

              }

          }
        }


    }

}
