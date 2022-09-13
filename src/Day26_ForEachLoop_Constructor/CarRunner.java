package Day26_ForEachLoop_Constructor;

public class CarRunner {
    public static void main(String[] args) {
              Car      car1      =      new        Car();
        //class ismi  obje adı  atama  keyword   Constructor

        System.out.println(car1.km+ " " + car1.model + " " + car1.renk + " " + car1.yil);//0 null null 2008
        //bir obje olustururken eger obje icin kendi class'indan belirlenen degerleri kullanmak
        //istiyorsan hic bir deger atamadan obje olusturabilirim
        //bu durumda hic bir parametre kullanilmadigi icin defult Contructor yeterli olacaktir
        //Eger obje olusturdugun class'taki degerleri kullanmak yerine kendi degerlerinle bir obje
        //olusturmak istersem o zman parametreli Contractor olusturmam gerekir

        //Car car2=new Car("Gri","Passat");
        //Car class'inda iki String parametresi olan constructor olmadigi icin
        //bu obje olusturmayı simdilik yapamayiz

    }
}
