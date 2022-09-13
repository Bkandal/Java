package Day18_NestedForLoop_WhileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Bolenlerini Bulmak İcin Pozitif Bir Tam Sayi Giriniz");
        int sayi= scan.nextInt();

        int sayac=0;
        int bolen=1;

        while (bolen<=sayi) {

            if (sayi%bolen==0){
                System.out.print(bolen + " ");
                sayac++;
            }
            bolen++;
        }
        System.out.println("");
        System.out.println(sayi + " Sayisinin " + sayac + " Adet Tam Boleni Vardir");
        scan.close();
    }
}
