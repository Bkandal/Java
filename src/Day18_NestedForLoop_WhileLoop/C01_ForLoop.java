package Day18_NestedForLoop_WhileLoop;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen aradaki sayilari ucer ucer yazdirmak icin İki Tam Sayı Giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        if (sayi1>sayi2){
            for (int i = sayi1; i >= sayi2; i-=3) {
                System.out.print(i + " ");
            }
        } else if (sayi1<sayi2) {
            for (int i = sayi1; i <= sayi2; i+=3) {
                System.out.print(i + " ");
            }
        }else {
            System.out.println("Girilen sayilar esittir");
        }
scan.close();
    }
}
