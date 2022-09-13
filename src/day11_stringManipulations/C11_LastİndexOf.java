package day11_stringManipulations;

import java.util.Scanner;

public class C11_LastİndexOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cümle giriniz");
        String cumle = scan.nextLine();
        System.out.println("Lutfen varligini kontrol etmemiz icin bir kelime giriniz");
        String kelime = scan.nextLine();

        int ilkIndex=cumle.indexOf(kelime);
        int sonIndex=cumle.lastIndexOf(kelime);
        if (ilkIndex==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamis");
        }else if (ilkIndex==sonIndex){
            System.out.println("Girilen kelime 1 kere kullanilmistir");
        }else {
            System.out.println("Girilen kelime 1 kereden fazla kullanilmistir");
        }
    }
}
