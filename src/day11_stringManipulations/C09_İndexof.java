package day11_stringManipulations;

import java.util.Scanner;

public class C09_İndexof {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cümle giriniz");
        String cumle = scan.nextLine();
        System.out.println("Lutfen varligini kontrol etmemiz icin bir kelime giriniz");
        String kelime = scan.nextLine();

        int index = cumle.indexOf(kelime);

        if (index < 0) {
            System.out.println("Girilen kelime cumlede kullanilmamıstir");
        }else if (cumle.indexOf(kelime,index+1)<0){
            System.out.println("Girilen kelime cumlede 1 kere kullanılmıs");
        }else {
            System.out.println("Girilen kelime cumlede birden fazla kullanılmıstır");
            scan.close();
        }
    }
}
