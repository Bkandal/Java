package Day16_ForLoop;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Yuzden Kucuk Bir Sayi Giriniz");
        int num = scan.nextInt();

        for (int i = 1;i <=num;i++){
            if (i%3==0 || i%5==0){
                System.out.println(i + " ");
            }
        }

    }
}
