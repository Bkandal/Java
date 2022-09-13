package Day17_ForLoop;

import java.util.Scanner;

public class C01_Palindrome {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Tersten Yazdirmak İcin Bir Yazi Giriniz");
        String str= scan.nextLine();

        if (str.equals(tersineCevir(str))){
            System.out.println("Girdiginiz String Palindrome");
        }else {
            System.out.println("Girdiginiz String Palindrome degil");
        }
    }
    public static String tersineCevir(String str) {
        String tersStr="";
        for (int i=str.length()-1;i>=0;i--){
            tersStr+=str.substring(i,i+1);
        }
        return tersStr;
    }
}
