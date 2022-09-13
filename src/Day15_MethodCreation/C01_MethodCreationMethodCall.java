package Day15_MethodCreation;
import java.util.Scanner;
public class C01_MethodCreationMethodCall {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki sayı girin\nilk sayidan sonra enter'e basin");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.println("Girilen sayilarin kareler toplamını istiyorsanız 2" +
                "\nkupler toplamını isiyorsanız 3'e basını");
        int secim= scan.nextInt();
        switch (secim){
            case 2:
                kareTopla(sayi1,sayi2);
                break;
            case 3:
                kupTopla(sayi1,sayi2);
                break;
            default:
                System.out.println("Lutfen istenen tercihlerden birini giriniz");
        }
    }
    public static void kupTopla(double sayi1, double sayi2) {
        double kuplerToplami=sayi1*sayi1*sayi1 + sayi2*sayi2*sayi2;
        System.out.println("Girilen sayilarinin kuplerinin toplamı = " + kuplerToplami);
    }
    public static void kareTopla(double sayi1, double sayi2) {
        double karelerToplami=sayi1*sayi1 + sayi2*sayi2;
        System.out.println("Girilen sayiların karelerinin toplamı = " + karelerToplami);
    }

}

