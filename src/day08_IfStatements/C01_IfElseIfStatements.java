package day08_IfStatements;

import java.util.Locale;
import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Bir Gun İsmi Giriniz");
        String gun = scan.nextLine().toLowerCase();
        if (gun.equals("pazartesi")) {
            System.out.println("Paz");
        } else if (gun.equals("sali")) {
            System.out.println("Sal");

        } else if (gun.equals("carsamba")) {
            System.out.println("Car");
        } else if (gun.equals("persembe")) {
            System.out.println("Per");
        } else if (gun.equals("cuma")) {
            System.out.println("cum");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Cum");
        } else if (gun.equals("pazar")) {
            System.out.println("Paz");
        } else {
            System.out.println("Lutfen geçerli bir gun ismi yaziniz");
        }
    }
}
