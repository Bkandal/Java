package Day27_Constructor_ConstructorCall;

public class Tir {


        int yil=2008;
        String renk;
        String model;
        int km;
        boolean satilikMi;

    public Tir(int i, String string, String string2, int j, boolean b) {
        km=i;
        model=string;
        renk=string2;
        yil=j;
        satilikMi=b;
    }

    public Tir(int km, String model, String renk) {
        this.km=km;
        this.model=model;
        this.renk=renk;


    }
}

