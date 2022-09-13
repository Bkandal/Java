package Day15_MethodCreation;

public class C04_MethodOverloading {
    public static void main(String[] args) {

        topla(2,4);
          }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("Dort Sayinin Toplami : " + (sayi1+sayi2+sayi3+sayi4));
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("Uc Sayinin Toplami : " + (sayi1+sayi2+sayi3));
    }

    private static void topla(int sayi1, int sayi2) {
        System.out.println("İki Sayinin Toplami : " + (sayi1+sayi2));
    }
}
