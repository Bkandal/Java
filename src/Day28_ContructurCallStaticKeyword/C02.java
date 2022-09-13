package Day28_ContructurCallStaticKeyword;

import java.sql.Time;
import java.util.Date;

public class C02 {
    int x=5;
    static int y=10;

    public static void main(String[] args) {
        C02 obje1=new C02();
        System.out.println("Obje1 icin x " + obje1.x + " Obje1 icin y " + obje1.y);
        obje1.x++;
        obje1.y++;

        System.out.println("İslemden Sonra Obje 1 icin x : " + obje1.x + " Obje1 İcin y : " + obje1.y);

        C02 obje2=new C02();

        System.out.println("Obje2 icin x " + obje2.x + " Obje2 icin y " + obje2.y);
        obje2.x++;
        obje2.y++;
        System.out.println("İslemden Sonra Obje2 icin x : " + obje2.x + " Obje2 İcin y : " + obje2.y);

        System.out.println("Obje 2 Olusturduktan ve İslemden sonra Obje 1 ' in "
        + " x : " + obje1.x + " y : " + obje2.y);

        C02 obje3=new C02();
        obje3.x=20;
        obje3.y=40;

        System.out.println("Obje3'den sonra obje1'in x : " + obje1.x);
        System.out.println("Obje3'den sonra obje2'in x : " + obje2.x);
        System.out.println("Obje3'den sonra obje2'in x : " + obje3.x);

        System.out.println("Obje3'den sonra obje1'in y : " + obje1.y);
        System.out.println("Obje3'den sonra obje2'in y : " + obje2.y);
        System.out.println("Obje3'den sonra obje2'in y : " + obje3.y);




    }

}
