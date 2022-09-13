package Day20_Scope;

public class InstanceVar {
    int notMat=50;
    int notFen;

    public static void main(String[] args) {
        InstanceVar celil=new InstanceVar();// Obje Oluşturma
        System.out.println(celil.notMat);

        InstanceVar nihal=new InstanceVar();
        nihal.notMat=70;
        System.out.println(nihal.notMat); // 70 yazdirir
        // Instance variable'larda değer atamazsak java instance olarak deger alir
        //ama istersekdeğer de atayabiliriz
        //bu durumda deger atamadigimiz obje icin yeni deger gecerli olur
        System.out.println(celil.notMat); // 50

        celil.notMat=90;
        System.out.println(celil.notMat);//90 yazdirir
celil.method2();
    }

    public static void staticMethod(){
        // İnstance variablelere static methodlara direk ulaşılamaz


    }

    public void method2(){
        // Bu method static olmadığından İnstance variable ulasilabilir
        notFen=100;
        System.out.println("Method2'deki notFen : " + notFen);

    }
}
