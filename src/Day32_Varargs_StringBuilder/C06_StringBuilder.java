package Day32_Varargs_StringBuilder;

public class C06_StringBuilder {
    public static void main(String[] args) {
        String str="Ali Can";
        String str2=new String("Veli Cem");

        StringBuilder sb=new StringBuilder("Yasasin Java");
        sb.append("!!!");

        System.out.println(sb);// Yasasin Java!!!

        String sbBuyukHarf=sb.toString().toUpperCase();
        System.out.println(sbBuyukHarf);// YASASİN JAVA!!!
    }
}
