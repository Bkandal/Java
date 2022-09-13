package Day18_NestedForLoop_WhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi=1;
        int toplam=0;
        int sayac=0;

        while (sayi !=0){
            System.out.println("Lutfen Toplama Eklemek İcin Bir Tam Sayi Yazin\nBitirmek İcin 0'a Basin");
            sayi= scan.nextInt();
            toplam+=sayi;
            sayac++;
        }
        System.out.println("Girilen Sayi Adedi : " + (sayac -1));
        System.out.println("Girilen Sayilarin Toplami : " + toplam);



    }
}
