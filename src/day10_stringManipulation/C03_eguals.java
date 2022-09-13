package day10_stringManipulation;

public class C03_eguals {
    public static void main(String[] args) {

        String str1 = "Ali Can";
        String str2 = "Ali CAN";
        String str3 = "Ali Can" + "";
        String str4 = "Ali Can";
        String str5 = new String("Ali Can");

        System.out.println(str1 == str2);// False

        System.out.println(str1 == str3);//ture
        System.out.println(str1.equals(str3));//Ture
        System.out.println(str1==str5);//False
        System.out.println(str1.equals(str5));//Ture
        System.out.println(str1.equals(str4));//True
        System.out.println(str3.equals(str5));//true
        System.out.println(str3==str5);//false


        /*
        String'lerde ayni String olsa bile == (Double equals) her zaman çalışmaz
        emin olmak isterseniz her zaman eguals() kullanmalısınız

        equals() kullandığımızda dikkat edeceğimiz tek ley metinlerin bire bir aynı olmasıdır

         */

    }
}
