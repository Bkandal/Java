package day11_stringManipulations;

public class C06_endsWith {
    public static void main(String[] args) {

        String input = "bayram@gmail.com";

        if (!input.contains("@gmail")) {
            System.out.println("Lutfen gmail adresi giriniz");
        } else if (input.endsWith("@gmail.com")){
            System.out.println("Email adresiniz kaydedildi");
        } else {
            System.out.println("Lutfen yazimi kontrol edin");
        }
    }
}
