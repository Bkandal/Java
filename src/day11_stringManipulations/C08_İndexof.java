package day11_stringManipulations;

import java.util.Scanner;

public class C08_İndexof {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cumle = scan.nextLine();
        System.out.println("Lütfen varligini kontrol etmek için bir harf giriniz");
        char krk = scan.next().charAt(0);

        int index = cumle.indexOf(krk);
        if (index < 0) {
            System.out.println("Girdiğiniz harf verilen cumlede yok");
        }else {
            System.out.println("Girdiginiz harf verilen cumlede var");
        }
    }
}
