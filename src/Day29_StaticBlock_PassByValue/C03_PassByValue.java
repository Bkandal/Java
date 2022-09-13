package Day29_StaticBlock_PassByValue;

public class C03_PassByValue {
    public static void main(String[] args) {

        //100 TL ye satilan bir urun icin 2 farkli indirim uygulayan iki method olusturalim

        int fiyat=100;

        System.out.println(indirimYap25(fiyat));//75
        System.out.println("Method'dan sonra Main Method'daki fiyat : " + fiyat);//100
        //indirimi kalici yapmak istiyorsak man method'da atama yapmamiz gerekir
        fiyat=indirimYap10(fiyat);



    }

    private static int indirimYap25(int fiyat) {
        fiyat*=0.75;
       return fiyat;
    }

    private static int indirimYap10(int fiyat) {
        fiyat*=0.90;
       return fiyat;

    }
}
