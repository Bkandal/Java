package day11_stringManipulations;

import java.util.Scanner;

public class C10_LastİndexOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cumle = scan.nextLine();
        System.out.println("Lütfen varligini kontrol etmek için bir harf giriniz");
        char krk = scan.next().charAt(0);

        int index=cumle.lastIndexOf(krk);

        if (index==(-1)){
            System.out.println("Harf cumlede kullanilmamis");
        }else {
            System.out.println("Harf cumlede kullanilmis");
        }
    }
}
