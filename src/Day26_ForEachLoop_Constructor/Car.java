package Day26_ForEachLoop_Constructor;

public class Car {
    // Java biz bir Class olusturdugumuzda, o class'dan obje olusturacagımızı bilir
    //ve her class'a default bir constructor yerlestirir
    //Javanın class'a koydugu bu default constructor gorulmez
    //ama obje uretmek uzere kod yazdigimizda otomatik olarak devreye girer

    //bir constructor olusturmak cok kolaydir
    //method'a benzer ama method'dan farklidir
    //1-Constructor ismi class ismi ile ayni olmalidir
    //class isimleri buyuk harfle basladigi icin Constructor ismi de buyuk harfle baslar
    //(method'dan 1. farki budur, method'lar kucuk harfle baslar
    //2.Constructor'larin return type olmaz
    //(method'dan 2. farki budur, method'larin mutlaka return taype'i olmalidir
    public Car(){

    }
    //Java'nin her class'da olusturdugu Constructor budur.

    int yil=2008;
    String renk;
    String model;
    int km;
    boolean satilikMi;

    //Bu gun itibari ile Class'larda main method olma mecburiyeti kaldirilmistir
    //Ancak bildigimiz gibi man method olmayan bir class direk calistirilamaz
    //Main method'u olmayan class'lar baska class'lardan obje olusturularak kullanılmak uzere
    //ihtiyac duyulan variable ve method'lari sakladigimiz bir depo gibidir

}
