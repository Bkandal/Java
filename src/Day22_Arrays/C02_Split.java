package Day22_Arrays;

import java.util.Arrays;

public class C02_Split {
    public static void main(String[] args) {
        //"Java ogrenmek cok guzel"

        String cumle="Java ogrenmek cok guzel";

        String kelimeler[]=cumle.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        for (int i =  kelimeler.length-1; i >=0; i--) {
            System.out.print(kelimeler[i] + " " );
        }
    }
}
