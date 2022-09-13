package Day27_Constructor_ConstructorCall;

public class TirRunner {
    public static void main(String[] args) {

        Tir tir1=new Tir(5000,"Scaina","Beyaz",2020,false);
        System.out.println(tir1.km+" "+tir1.model+" "+tir1.renk+" "+tir1.yil+" "+tir1.satilikMi);

        Tir tir2=new Tir(12000,"Cargo","Kirmizi");
        System.out.println(tir2.km+" "+tir2.model+" "+tir2.renk+" "+tir2.yil+" "+tir2.satilikMi);
    }
}
