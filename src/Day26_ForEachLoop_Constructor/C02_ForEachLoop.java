package Day26_ForEachLoop_Constructor;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        int arr[]={3,4,2,5};
        int carpim=1;

        for (int each:arr) {
            carpim*=each;
        }
        System.out.println("Arrayin Elemanlarinin Carpimi : "+ carpim);
    }
}
