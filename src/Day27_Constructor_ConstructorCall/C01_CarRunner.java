package Day27_Constructor_ConstructorCall;

import Day26_ForEachLoop_Constructor.Car;

public class C01_CarRunner {
    public static void main(String[] args) {

        Car car=new Car();
        System.out.println(car);

        Car1 car1=new Car1();
        System.out.println(car1.km+ " " + car1.model + " " + car1.renk + " " + car1.yil);//0 null null 2008
    Car1 car3=new Car1();
    car3.km=40000;
    car3.satilikMi=true;
        System.out.println(car3.km+ " " + car3.model + " " + car3.renk + " " + car3.yil + " " + car3.satilikMi);//40000 null null 2008 true




    }
}
