package Day26_ForEachLoop_Constructor;

public class JeepRunner {
    public static void main(String[] args) {
        Jeep jeep1=new Jeep();
        System.out.println(jeep1.fiyat+ " "+jeep1.ilanNo + " " + jeep1.marka +
                " " + jeep1.model+" "+jeep1.yil);
        jeep1.fiyat=300;
        jeep1.ilanNo=1002;
        jeep1.marka="Volwagen";
        jeep1.model="Passat";
        jeep1.yil=2008;
        System.out.println(jeep1.fiyat+ " "+jeep1.ilanNo + " " + jeep1.marka +
                " " + jeep1.model+" "+jeep1.yil);

        jeep1.hiz(150);
        jeep1.yakit("Benzin");
    }



}
