package day10_stringManipulation;

public class C04_equalsIgnoreCase {
    public static void main(String[] args) {

        String str1 = "Ali Can";
        String str2 = "ali can";
        String str3 = "ALI CAN";
        String str4 = "Ali Can_";

        System.out.println(str1.equals(str2)); //False
        System.out.println(str1.equalsIgnoreCase(str2));//Ture
        System.out.println(str2.equals(str3));//False
        System.out.println(str2.equalsIgnoreCase(str3));//Ture
        System.out.println(str1.equals(str4));//False
                System.out.println(str1.equalsIgnoreCase(str4));//Ture
    }
}