package day08_IfStatements;

import java.util.Scanner;

public class C05_NestedIfElseStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Sifre Giriniz");
        String sifre=scan.nextLine();
        char ilkHarf=sifre.charAt(0);
        if (ilkHarf>='A' && ilkHarf<='Z'){
            if (ilkHarf=='A'){
                System.out.println("Gecerli Sifre");
            }else {
                System.out.println("Gecersiz Sifre");
            }
        }else if (ilkHarf>='a'&& ilkHarf<='z'){
              if (ilkHarf=='z'){
                  System.out.println("Gecerli Sifre");
              }else {
                  System.out.println("Gecersiz Sifre");
              }
    }else {
            System.out.println("Lutfen ilk karakter icin sadece harf kullanın");
    }

}
}
