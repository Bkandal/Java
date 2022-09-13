package day10_stringManipulation;

public class C05_length {
    public static void main(String[] args) {

        String str1 = "Java ogren, isi kap";
        System.out.println(str1.length());//Str nin karakter sayısını döndürür
        System.out.println(str1.charAt(str1.length() - 1));//Son karakteri verir
        System.out.println(str1.charAt(str1.length() - 3));//sondan 3. karakteri verir

        /*
        Java'da null pointer (İşaretliyici) bir değer değil,
        karşısına yazıldığı veriable'nin hiç bir değer almadığının işaretçisidir.
        */

        String str2 = ""; //str2 ye bir değer atanmıştır
        // bu değer nedir: hiçlik
        System.out.println(str2.length());//0 yazdırır
        String str3 = null;//str3 ye bir değer atanmamıştır
                            // null bu değer atamamayı işaret etmektedir
        System.out.println(str3.length());// bir değer atanmamış kşi nasıl uzunluğu olsun!!
                                          // NullPointerException olarak hata verir
        


    }
}
