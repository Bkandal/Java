package day10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str = "Java ogrenmek cok guzel";
        System.out.println(str.indexOf("o"));//5
        System.out.println(str.indexOf("g"));//6
        System.out.println(str.indexOf("t"));// bana İnt döndürüyor
        //int'da "Yok" diye bir değer bulunmuyor
        //0 dersek J nin indeksidir
        // negatif bir değer dönerse biz aranan str'de olmadığını anlarız
        // Java _1 döndürmeyi tercih etmiştir
        String str5 = "awdfqawsdqw;awdadwad0dskdna";
        if (str5.indexOf("?") == -1) {
            System.out.println("str5 de istenen karakter kulanılmamıştır");
        } else
            System.out.println("str5'de istenen karakter kulanılmıştır");
    }
}
