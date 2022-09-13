package day11_stringManipulations;

import java.util.Scanner;

public class C14_Contains {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cümle giriniz");
        String cumle=scan.nextLine();
        
        if (cumle.contains("buyuk")&&cumle.contains("kucuk")){
            System.out.println("Kucuk mu buyuk mu karar ver");
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        }else {
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }
scan.close();

    }
}
