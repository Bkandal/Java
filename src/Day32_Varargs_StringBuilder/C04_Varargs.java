package Day32_Varargs_StringBuilder;

public class C04_Varargs {
    public static void main(String[] args) {
        kafanagoreislem(5, 10, 13, 0);
    }
    //Vararges'da hic eleman olmasa da vararges hic itiraz etmez
    //once int olarak tanimlanan sayilari esitlestirir
    //kalan tum sayilari vararges'a doldurur
    private static void kafanagoreislem(int sayi1, int sayi2, int... sayilar) {
        int toplam = 0;
        for (int each : sayilar) {
            toplam += each;
        }
        System.out.println("İlk Sayi İle Digerlerinin Toplami : " + sayi1 * toplam);//65

    }
}