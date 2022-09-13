package Day16_ForLoop;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Tersten Yazdirmak İcin Bir Yazi Giriniz");
        String str= scan.nextLine();
        for (int i=str.length()-1;i>=0 ;i--){
            System.out.println(str.substring(i,i+1));
        }
    }
}
