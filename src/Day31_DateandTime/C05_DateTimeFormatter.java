package Day31_DateandTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);//2022-09-01T22:18:33.609511800

        //Eger tarih ve saati kendi istedigimiz gibi yazmak istersek
        //Gun / Ay / Yıl saat:dakika

        DateTimeFormatter duzenle=DateTimeFormatter.ofPattern(" dd / MM / YYYY EEE HH : mm ");
        System.out.println(duzenle.format(tarihSaat));//01 / 09 / 2022 Per 22 : 23

        /*
        format olustururken;
        Gun
        d: Basta 0 varsa onu yazmadan gun numarasi
        dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarası
        DDD: yilin kacinci günü olduğunu yazar
        E,EE,EEE: gun isminin ilk 3 harfini getiri
        EEEE: gün isminin tamamini getiri

        Ay(Ay için M dakikka için m kullanilir)
        Yıl YYYY
        YY : Yilin son iki rakamini

        Saat(24 saat üzerinden istiyorsak H, 12 saat üzerinden istiyorsak h)
        HH: saatin tamamini tek rakamli olursa 02 gibi
        H: tek rakamli saat olursa sadece saatii

         */
    }
}
