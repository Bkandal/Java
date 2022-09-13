package day07İfStatements;

import java.util.Scanner;

public class C07_IfElseIfStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Yasınızı Giriniz");
        int yas = scan.nextInt();

        if (yas < 0) {
            System.out.println("Lütfen Geçerli Bir Yaş Yazınız");
        }else if (yas < 65) {
            System.out.println("Emekli Olamazsın," + (65 - yas) + " Yıl Daha Çalışmalısın");

        } else {
            System.out.println("Emekli Olabilirsin");
        }
    }
}
