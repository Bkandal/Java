package day11_stringManipulations;

import java.util.Scanner;

public class C13_Cointains {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gmail adresinizi giriniz");

        String email=scan.next();
        int uzunluk=email.length();
        int index=email.lastIndexOf("@gmail.com");

        if (!email.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresi giriniz");
        }else if (index==uzunluk-10){
            System.out.println("Email adrsinizi kaydedildi");

        }else {
            System.out.println("Lutfen yazimi kontrol ediniz");
        }
scan.close();
    }
}
