package Day32_Varargs_StringBuilder;

public class C05_Varargs {
    public static void main(String[] args) {
        topla(5,10,13,0);
    }
    //Varargs 'dan once farklı parametreler kullanilabilir
    //ama varargs'dan sonra parametre yazilmaz
    //yazarsaniz java vararg son parametre olmalidir diye sizi uyarir
    //ve CTE verir
    private static void topla(int ... sayilar) {
        int toplam=0;
        for (int each:sayilar) {
            toplam+=each;
        }
        System.out.println("Girilen Sayilarin Toplami : " + toplam);//28

    }
}
