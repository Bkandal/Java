package Day29_StaticBlock_PassByValue;

public class C02_PassBy {
    public static void main(String[] args) {

        //100 TL ye satilan bir urun icin 2 farkli indirim uygulayan iki method olusturalim

        int fiyat=100;

        indirimYap25(fiyat);
        System.out.println("Method'dan sonra Main Method'daki fiyat : " + fiyat);//100
        indirimYap10(fiyat);
        System.out.println("Method'dan sonra Main Method'daki fiyat : " + fiyat);//100
    }

    private static void indirimYap25(int fiyat) {
        fiyat*=0.75;
        System.out.println("%25 indirimli fiyat : " + fiyat);//75
    }

    private static void indirimYap10(int fiyat) {
        fiyat*=0.90;
        System.out.println("%10 indirimli fiyat : " + fiyat);//90

    }
}
