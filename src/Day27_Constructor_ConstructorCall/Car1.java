package Day27_Constructor_ConstructorCall;

public class Car1 {


       int yil=2008;
        String renk;
        String model;
        int km;
        boolean satilikMi;


    public Car1(int km, String model, String renk, int yil, boolean satilikMi) {
    }

    public Car1(int km) { // bu satırdaki int km class level deki int km farkli scop'lardadir

    }

    public Car1() {

    }

    public Car1(int i, int i1) {
        yil=i;
        km=i1;
    }
}

