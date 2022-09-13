package day07İfStatements;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen yasınızı giriniz");
        int yas=scan.nextInt();

        if (yas <65){
            System.out.println("Emekli Olamazsın,"+(65-yas)+" Yıl Daha Çalışmalısın");

        }else {
            System.out.println("Emekli Olabilirsin");
        }

    }
}
