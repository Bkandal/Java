package Day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {
    public static void main(String[] args) {
        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("F");
        harfler.add("D");
        System.out.println(harfler);//[A, Z, F, D]

        harfler.remove(1);// List'deki 1. İndexteki (Z) kaldırır.

        System.out.println(harfler);// [A, F, D]

        System.out.println(harfler.remove(2));//D

        System.out.println(harfler);//A,F

        System.out.println(harfler.remove("F"));//true

        System.out.println(harfler.remove("B"));//false
        System.out.println(harfler);

        harfler.add("A");
        harfler.add("Z");
        harfler.add("F");
        System.out.println(harfler);// [A, A, Z, F]

        System.out.println(harfler.remove("A"));//true
        System.out.println(harfler);//[A, Z, F]
        harfler.add("A");
        System.out.println(harfler);//[A, A, Z, F]

        harfler.removeAll(harfler);

        System.out.println(harfler);

        List<String> silinecekharfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("F");
        harfler.add("D");
        silinecekharfler.add("A");
        silinecekharfler.add("C");
        silinecekharfler.add("F");

        System.out.println(harfler);//[A, Z, F, D]

        System.out.println(silinecekharfler);//[A, C, F]

        harfler.removeAll(silinecekharfler);
        System.out.println(harfler.removeAll(silinecekharfler));//true
        System.out.println(harfler);//[Z, D]
        System.out.println(silinecekharfler);//[A, C, F]
        //eger listemis İnteger'lardan olusuyorsa
        //java remov(index) ve remov(Object) metodlari karısmasın diye
        //girilen sayiyi index olarak kabul eder


    }
}
