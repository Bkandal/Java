package Day30_immutubleClasses;

public class C04_Homework {
    public static void main(String[] args) {
        String a= "";
        a+=2;
        a+='c';
        a+= false;
        System.out.println(a);//2cfalse

        if (a=="2cfalse"){
            System.out.println("==");
        }
      if (a.equals("2cfalse")) {
          System.out.println("eguals");
      }

    }
}
