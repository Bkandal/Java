package day08_IfStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 0 ila 100 arasi bir not giriniz");
        double note = scan.nextDouble();
        if (note < 0 || note > 100) {
            System.out.println("Lutfen gecerli bir not giriniz");
        } else if (note < 50) {
            System.out.println("Notunuz: D ");
        } else if (note < 60) {
            System.out.println("Notunuz: C ");
        } else if (note < 80) {
            System.out.println("Notunuz: B ");
        } else {
            System.out.println("Notunuz: A ");
        }

    }
}
