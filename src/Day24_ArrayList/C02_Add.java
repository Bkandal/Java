package Day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();
        System.out.println("Bos Liste : " + isimler);
        isimler.add("Ali");
        System.out.println("Birinci Eleman : " + isimler);
        isimler.add("Veli");
        System.out.println("İkinci Eleman : " + isimler);
        isimler.add("Can");
        System.out.println("Ücüncü Eleman : " + isimler);
        isimler.add(1,"Ayse");
        System.out.println("1. İndexe Ayse Ekledik : " + isimler);
        //isimler.add(5) Declare ederken belirtiğimiz data türü disinda bir data türünden ekleme yapamayız

        List<String>liste2=new ArrayList<>();
        liste2.add("Günter");
        liste2.add("Emrah");
        System.out.println("Liste 2 : " + liste2);

        isimler.addAll(4,liste2);
        System.out.println("Sona Liste 2 yi ekledik : " + isimler);

        isimler.addAll(liste2);
        System.out.println("İndex Olmadan Liste 2 yi Tekrar Ekledik : " + isimler);



    }
}
