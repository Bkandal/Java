package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ilk sayiyi girin");
        double sayi1 = scan.nextDouble();
        System.out.println("Lütfen 2. sayiyi giriniz");
        double sayi2 = scan.nextDouble();

        System.out.println("Girilen sayilarin carpimi: " + sayi1 * sayi2);
    }
}
