package Day17_ForLoop;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Faktoryel Hesaplamak İcin 10'dan Kucuk Bir Tam Sayi Girin");
        int sayi= scan.nextInt();
        int faktoryel=1;
        System.out.println(sayi + "!=");
        for (int i = sayi; i >1 ; i--) {
            faktoryel*=i;
            System.out.println(i + "*");
        }
        System.out.println("1=" + faktoryel);
        scan.close();
    }

}
