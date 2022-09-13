package Day31_DateandTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {
    public static void main(String[] args) {
        LocalTime saat=LocalTime.now();
        System.out.println("Baslangic Saati : " + saat);//Sistem Saati

        int sayi=10;
        for (int i = 0; i < 10000; i++) {
            sayi++;
        }
        LocalTime saatBitis=LocalTime.now();
        System.out.println("Bitis Saati : " + saatBitis);//Sistem saati ile işlemin yapıldığı saat
        //Eger bir islemin baslangic ve bitis zamanini
        //kaydetmek istiyorsak
        //hem basinda, hem de sonunda local time objesi olusturmaliyiz

        double nano1=saat.getNano();
        double nanobitis=saatBitis.getNano();
        System.out.println("For Loop : " + (nanobitis-nano1) + " nano saniyede tamamlandı");//1.38024E7

        LocalTime yerelSaat=LocalTime.now(ZoneId.of("Turkey"));
        System.out.println(yerelSaat);//
    }
}
