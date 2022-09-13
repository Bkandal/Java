package Day19_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Rakamlar Toplamini Bulmak İcin Pozitif Bir Tam Sayi Giriniz");
        int sayi= scan.nextInt();

        int rakamlarToplami=0;
        int rakam=0;

        rakamlarToplami=0;
        String sayiStr=""+sayi;
        for (int i = 0; i < sayiStr.length(); i++) {
            rakam=sayi%10;
            rakamlarToplami+=rakam;
            sayi/=10;
        }
        System.out.println("Girdiğiniz Sayinin Rakamlar Toplamı : " + rakamlarToplami);
scan.close();
    }
}
