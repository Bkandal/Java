package Day31_DateandTime;

import java.time.LocalTime;

public class C04 {
    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();
        System.out.println("Baslangic Saati : " + saat);//Sistem Saati

        int sayi=10;
        for (int i = 0; i < 10000; i++) {
            sayi++;
        }
        LocalTime saatBitis=LocalTime.now();
        System.out.println("Bitis Saati : " + saatBitis);
        double nano1=saat.getNano();
        double nanobitis=saatBitis.getNano();
        System.out.println("For Loop : " + (nanobitis-nano1) + " nano saniyede tamamlandı");

        LocalTime saatS=LocalTime.now();
        System.out.println("Baslangic Saati : " + saatS);//Sistem Saati

        String str="Celil";
        for (int i = 0; i < 10000; i++) {
            str+=" ";
        }
        LocalTime saatBitisS=LocalTime.now();
        System.out.println("Bitis Saati : " + saatBitisS);
        double nanoS=saatS.getNano();
        double nanobitisS=saatBitisS.getNano();
        System.out.println("For Loop : " + (nanobitisS-nanoS) + " nano saniyede tamamlandı");//

        double strigSure=nanobitisS-nanoS;
        double intSure=nanobitis-nano1;

        System.out.println("İnt String'den : " + (strigSure-intSure) + " nano saniye daha hizli bitirdi");

        System.out.println(saat.getMinute());//10
        System.out.println(saat.plusMinutes(10000));//20:51:22.723297700
        System.out.println(saat.minusHours(10));//12:12:10.709584400

    }
}
