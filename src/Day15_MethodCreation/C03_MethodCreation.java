package Day15_MethodCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen toplamak istediginiz sayi adedini 2,3 veya 4'ten biri olarak secin");
        int tercih=scan.nextInt();
        if (tercih>4){
            tercih=5;
        }
        switch (tercih){
            case 2:
                ikiSayiTopla();
                break;
            case 3:
                ucSayiTopla();
                break;
            case 4:
                dortSayiTopla();
                break;
            case 5:
                System.out.println("Cok Sayi Girdiniz, Ben Toplayamam");
                break;
            default:
                System.out.println("Gecersiz Tercih");
        }
    }
    private static void dortSayiTopla() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dort sayi girin\nHer sayidan sonra Enter'e basin");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        double sayi3= scan.nextDouble();
        double sayi4= scan.nextDouble();
        System.out.println("Girdiginiz iki sayinin toplamı = " + (sayi1+sayi2+sayi3+sayi4));
    }
    private static void ucSayiTopla() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Uc sayi girin\nHer sayidan sonra Enter'e basin");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        double sayi3= scan.nextDouble();
        System.out.println("Girdiginiz iki sayinin toplamı = " + (sayi1+sayi2+sayi3));
    }
    private static void ikiSayiTopla() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi girin\nHer sayidan sonra Enter'e basin");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("Girdiginiz iki sayinin toplamı = " + (sayi1+sayi2));
    }
}
