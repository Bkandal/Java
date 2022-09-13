package day11_stringManipulations;

public class C02_lastİndexOf {
    public static void main(String[] args) {

        String cumle="Java cok kolay, Java cok guzel";
        String kelime="Java";

        /*
        verilen kelime icin asagidaki sartlardan uygun olanı yazan bir program yazınız
        -verilen kelime cümlede kullanilmamıs
        -verilen kelime cümlede 1 kere kullanılmıs
        -verilen kelime cümlede birde fazla kullanulmiş
         */

        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1){
            System.out.println("Verilen kelime cümlede kullanılmamıştır");
        } else if (kelimeIlkIndex==kelimeSonIndex) {
            System.out.println("verilen kelime 1 kere kullanılmıştır");
        }else{
            System.out.println("Verilen kelime birden fazla kullanılmıştır");
        }
    }
}
