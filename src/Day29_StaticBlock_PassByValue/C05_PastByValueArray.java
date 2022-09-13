package Day29_StaticBlock_PassByValue;

public class C05_PastByValueArray {
    public static void main(String[] args) {

        int sayilar[]={3,4,5,6};
        elemanDegistir(sayilar);
        System.out.println("Eleman Degistir Methodundan sonra : " + sayilar);
        arrayiDegistir(sayilar);
        System.out.println("Array degistir Methodundan Sonra : " + sayilar);
    }

    private static void arrayiDegistir(int[] sayilar) {
        sayilar=new int[6];
        System.out.println("Array degistir Methodunda : " + sayilar);
    }

    private static void elemanDegistir(int[] sayilar) {
        sayilar[0]=10;
        System.out.println("Eleman Degistir Methodu : " + sayilar);
    }
}
