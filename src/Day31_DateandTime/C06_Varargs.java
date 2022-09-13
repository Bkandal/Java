package Day31_DateandTime;

public class C06_Varargs {
    public static void main(String[] args) {

        int a= 10;
        int b=20;
        int c=30;
        int d=40;
        int e=50;
        int f=60;


        topla(a,b);
        topla(a,b,c,d,e,f);
    }

    private static void topla(int ...a) {
        System.out.println();
    }

    private static void topla(int a, int b) {
        System.out.println(a+b);
    }
}
