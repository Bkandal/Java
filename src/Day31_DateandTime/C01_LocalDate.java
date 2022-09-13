package Day31_DateandTime;
import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih= LocalDate.now();
        System.out.println(tarih);//2022-09-01
        System.out.println(tarih.getDayOfYear());//244
        System.out.println(tarih.getDayOfWeek());//THURSDAY
        System.out.println(tarih.getMonthValue());//9
        System.out.println(tarih.getMonth());//SEPTEMBER
        System.out.println(tarih.plusDays(20));//2022-09-21
        System.out.println(tarih.plusWeeks(15));//2022-12-15
        System.out.println(tarih.plusYears(4));//2026-09-01

        System.out.println(tarih.plusYears(10).plusYears(10).plusYears(10));//2052-09-01

        System.out.println(tarih.minusDays(10));//2022-08-22
        System.out.println(tarih.minusYears(10));//2012-09-01

        System.out.println(tarih.minusYears(22).isLeapYear());//true

        LocalDate dogumTarihi1=LocalDate.of(1998, Month.SEPTEMBER,12);
        LocalDate dogumtarihi2=LocalDate.of(1990,04,26);
        LocalDate dogumTarihi3=LocalDate.of(2000,07,25);
        System.out.println(dogumTarihi1 + " " + dogumtarihi2);//1998-09-12 1990-04-26

        System.out.println(dogumTarihi1.isAfter(dogumtarihi2));//true
        System.out.println(dogumTarihi3.isBefore(dogumtarihi2));//false




    }
}
