package Day16_ForLoop;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Tersten Yazdirmak İcin Bir Yazi Giriniz");
        String str= scan.nextLine();
        System.out.println(tersineCevir(str));
        scan.close();
    }

    public static String tersineCevir(String str) {
        String tersStr="";
        for (int i=str.length()-1;i>=0;i--){
            tersStr+=str.substring(i,i+1);
        }
        return tersStr;
    }
}
