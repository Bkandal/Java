package Day17_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen aradaki tum sayilari toplamak icin iki tam sayi girin");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        int kucuk=0;
        int buyuk=0;

        if (sayi1>sayi2){
            buyuk=sayi1;
            kucuk=sayi2;
        }else {
            buyuk=sayi2;
            kucuk=sayi1;
        }
        int toplam=0;

        for (int i=kucuk;i <= buyuk; i++){
            toplam+=i;
        }
        System.out.println("Girilen Sayilar ve Aralarindaki Sayilarin Toplami : "+ toplam);

        scan.close();
    }
}
