package Day32_Varargs_StringBuilder;

public class C03_Varargs {
    public static void main(String[] args) {
        kafanagoretopla(5,10,13,0);
    }

    private static void kafanagoretopla(int sayi1,int ... sayilar) {
        int toplam=0;
        for (int each:sayilar) {
            toplam+=each;
        }
        System.out.println("İlk Sayi İle Digerlerinin Toplami : " + sayi1 * toplam);//115

    }
}
