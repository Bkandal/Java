package Day32_Varargs_StringBuilder;

public class C02_Varrags {
    public static void main(String[] args) {
        topla(5,10,13,0);
    }

    private static void topla(int ... sayilar) {
        int toplam=0;
        for (int each:sayilar) {
            toplam+=each;
        }
        System.out.println("Girilen Sayilarin Toplami : " + toplam);//28

    }
}
