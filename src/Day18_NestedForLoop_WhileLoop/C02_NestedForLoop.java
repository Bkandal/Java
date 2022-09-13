package Day18_NestedForLoop_WhileLoop;

import java.util.Scanner;

public class C02_NestedForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 10'dan kucuk pozitif bir tam sayi giriniz");
        int sayi= scan.nextInt();

        for (int satir = 1; satir <=sayi ; satir++) {

            for (int i =1; i <=satir ; i++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
