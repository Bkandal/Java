package day07İfStatements;

import java.util.Scanner;

public class C04_BasitIfStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir gun ismi giriniz");
        String girilenGun = scan.next().toLowerCase();

        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")) {
            System.out.println("Girilen gun HAFTASONU");
        }

        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
                || girilenGun.equals("cuma")) {
            System.out.println("Girilen gun HAFTAICI");
        }
        if (!(girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
                || girilenGun.equals("cuma") || girilenGun.equals("cumartesi")
                || girilenGun.equals("pazar"))) {
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }
    }
}