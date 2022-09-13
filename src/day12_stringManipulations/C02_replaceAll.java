package day12_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str = "1Bu2gu3n Ja*va- cok g3uz/el";

        // str'i Bugun Java cok güzel haline getirin
        // replaceAll() metodundaki amacı aynı özellikteki tum karakterleri kapsamasıdır
        //butun sayıları sil
        //butun özel karakterleri sil!

        //tum özel karakterleri silelim dediğimizde space'ler de siliniyor
        //space'leri korumak için en başta onların yerine cumlede nulunmayacak
        //bir strink koyalım
        //"qazwsx"
        str=str.replace(" ","qazwsx");
        System.out.println(str);

        str = str.replaceAll("\\W", "");
        System.out.println(str);
        str=str.replaceAll("\\d","");

        //istenmeyen özel karakter ve sayılardan kurtulduk
        //şimdi spaceleri geri getirelim

        str=str.replace("qazwsx"," ");
        System.out.println(str);

    }
}
