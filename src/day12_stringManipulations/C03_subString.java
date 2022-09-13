package day12_stringManipulations;

public class C03_subString {
    public static void main(String[] args) {

        String isim="Suleyman";
        String soyİsim="Karanfil";
        String kartNo="2323 4456 7586 9909";

        System.out.println(isim.substring(3));
        System.out.println(soyİsim.substring(soyİsim.length()-3));
        System.out.println(isim.substring(2,4));// le

        //İsim ve Soyismin ilk harfi buyuk har geriye kalan *
        //kredi kartının ilk dört rakamı görünsün geri kalan *

        String isimİlkHarf=isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar=isim.substring(1).replaceAll("\\w","*");

        String soyİsimİlkHarf=soyİsim.substring(0,1).toUpperCase();
        String soyİsimGeriyeKalanlar=soyİsim.substring(1).replaceAll("\\w","*");

        String kkİlk4=kartNo.substring(0,4);
        String kkGeriyeKalanlar=" **** **** ****";

        System.out.println(isimİlkHarf+isimGeriyeKalanlar+" "+
                soyİsimİlkHarf+soyİsimGeriyeKalanlar+"\n"+
                kkİlk4+kkGeriyeKalanlar);



    }
}
