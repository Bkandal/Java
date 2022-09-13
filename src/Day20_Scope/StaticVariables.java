package Day20_Scope;

public class StaticVariables {

    static int no=20;
    static int sayi;
    static String adres="Ankara";
    static String cadde;
    static boolean aktifMi=true;
    static boolean tatildeMi;

    public static void main(String[] args) {
        System.out.println(no);//20
        no++;
        System.out.println(no);//21
        staticMethod();
        System.out.println(no);
        StaticVariables obje=new StaticVariables();
        obje.staticOlmayanMethod();
        System.out.println(no);
    }

    public static void staticMethod(){
        no++;
        System.out.println("Static Method'da Sayi : " + no);//22
    }
    public void staticOlmayanMethod(){
        //Static ver. static olsun olmasın tüm methotlardan ulaşılabilir
        //bu yuzden static variable'lar Class Variable denir.
        no++;
        System.out.println("Static Olmayan Methot : " + no);
    }
}
