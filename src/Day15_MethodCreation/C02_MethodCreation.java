package Day15_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen İsminizi ve Soyisminizi Giriniz\n" +
                "Isimden Sonra Enter'e Basın");
        String isim = scan.next();
        String soyisim = scan.next();
        System.out.println("İsmnizin acik sekilde yazilmasini istiyorsanız 1" +
                "\nİsmnizin gizli sekilde yazilmasini istiyorsanız 2'e basını");
        int tercih=scan.nextInt();
        String birlesmisisim=null;
        if (tercih==1){
            birlesmisisim=acikisim(isim,soyisim);
        } else if (tercih==2) {
            birlesmisisim=isimGizle(isim,soyisim);
        }else {
            System.out.println("Lutfen 1 veya 2 secin");
        }

        System.out.println("Kullanicinin Tercihi : " + birlesmisisim);
    }
    public static String isimGizle(String isim, String soyisim) {
        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w","*");
        soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w","*");
        return isim+" "+soyisim;
    }
   public static String acikisim(String isim, String soyisim) {
        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
        soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
        return isim+" "+soyisim;

    }
}


