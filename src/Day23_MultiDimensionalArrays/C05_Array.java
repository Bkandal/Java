package Day23_MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_Array {
    public static void main(String[] args) {
        String cumle = "Her Sey, Javayla Kolay";
        String kelimeler[]=cumle.split(" ");
        System.out.println(Arrays.toString(kelimeler));//[Her, Sey,, Javayle, Kolay]
        System.out.println("Girilen Cumlede " + kelimeler.length + " adet kelime vardır");


    }
}
