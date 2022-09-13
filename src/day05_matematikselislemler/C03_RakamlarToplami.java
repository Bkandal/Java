package day05_matematikselislemler;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lüften 4 basmakli pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt(); //5267

        int birlerBasamagi =0;
        int rakamlarToplami = 0;
        int ilkGirilenSayi=sayi;

        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;

        sayi /= 10;

        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;

        sayi /= 10;

        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;

        sayi/=10;

        birlerBasamagi = sayi % 10;
        rakamlarToplami += birlerBasamagi;

        sayi /= 10;

        System.out.println(ilkGirilenSayi + " sayisinin rakamlar toplami : " + rakamlarToplami);

    }
}
