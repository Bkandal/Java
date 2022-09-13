package day09_ternary;

public class C06_SwitchCase {
    public static void main(String[] args) {
        String input = "Pazartesi";
        input = input.toLowerCase();

        switch (input) {
            case "pazartesi":
                System.out.println("Hafta ici");
                break;
            case "sali":
                System.out.println("Hafta ici");
                break;
            case "carsamba":
                System.out.println("Hafta ici");
                break;
            case "persembe":
                System.out.println("Hafta ici");
                break;
            case "cuma":
                System.out.println("Hafta ici");
                break;
            case "cumartesi":
                System.out.println("Hafta sonu");
                break;
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lutfen Gecerli Bir Gün Giriniz");
        }
        switch (input) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("Hafta ici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lutfen Gecerli Bir Gün Giriniz");
        }


    }
}
