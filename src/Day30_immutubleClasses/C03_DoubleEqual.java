package Day30_immutubleClasses;

public class C03_DoubleEqual {
    public static void main(String[] args) {
        //Javada String 2 türlü olusturulabilir
        //1-non-primitive oldugu icin
        //java once esitligin sagina baktigindan
        //new kelimesi oldugu icin once obje olusturur
        //sonra deger atar
        //Yani bu olusturma seklinde her zaman yeni bir obje olusur

        //2- bu gune kadar ogrendigimiz gibi olusturursak
        //String str2="Mustafa";
        // java bu durumda esitligin saginda olan
        // //String'in Strıngın Havuzu'nda olup olmadigini
        //kontrol eder ve havuzda varsa
        //yeni obje olusturmaz, oncekinin referansina
        // yeninin referansini' da ekler

        String str1="Mustafa";
        String str2="Mustafa";

        String str3=new String("Mustafa");
        String str4=new String("Mustafa");

        System.out.println(str1==str3);//false
        System.out.println(str1.equals(str3));//true

        System.out.println(str1==str2);//true


    }
}
