package Day27_Constructor_ConstructorCall;

public class C02_ParametreliConstructor {
    public static void main(String[] args) {

        Car1 car1=new Car1(50000, "Passat", "Gri", 2008, true);

        Car1 car2=new Car1(35000);
        System.out.println(car2.km);//35000

        Car1 car3=new Car1();
        System.out.println(car3.km);//0

        Car1 car4=new Car1(1000);
        System.out.println(car4.km);//1000

        Car1 car5=new Car1(2020,5000);
        System.out.println(car5.yil + " " + car5.km + " " + car5.model);//2020 5000 null
    }
}
