package day08_IfStatements;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Cinsiyetinizi ve Yasinizi Giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'E') {
            if (yas < 0 || yas > 80) {
                System.out.println("Gecerli yas giriniz");
            } else if (yas < 65) {
                System.out.println("Emekli Olamazsınız");
            }else {
                System.out.println("Emekli Olabilirsiniz");
            }

        } else if (cinsiyet == 'K') {
            if (yas < 0 || yas > 80) {
                System.out.println("Gecerli yas giriniz");
            } else if (yas < 65) {
                System.out.println("Emekli Olamazsınız");
            }else {
                System.out.println("Emekli Olabilirsiniz");
            }
        } else {
            System.out.println("Lutfen ");
        }
    }


}
