package javaDers32;

public class CokBoyutluArray {
    public static void main(String[] args) {


        String[][] sayilar1 = new String[2][3];  // iki boyutlu array
     //   int[][][] sayilar2 = new int[2][3][5];  // uc boyutlu array  Genellikle buyuk hesaplamalarda kullanilir

// yontem1

        sayilar1[0][0]="Ali";
        sayilar1[0][1]="Ahmet";
        sayilar1[0][2]="fatma";
        sayilar1[1][0]="Veli";
        sayilar1[1][1]="Kazim";
        sayilar1[1][2]="selahattin";

        for (int i=0;i<sayilar1.length;i++){
            for (int j=0;j<sayilar1[i].length;j++){
                System.out.print(sayilar1[i][j]+", ");
            }
        }

    }
}
