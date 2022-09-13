package Day21_scope_arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        int arr[]={3,5,8,5,2,4};

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
        }
        System.out.println("Elemetlerin Toplami : " + toplam);
    }
}
