package Day21_scope_arrays;

import java.util.Arrays;

public class C07_Arrays {
    public static void main(String[] args) {
        int arr[]={3,5,8,5,2,4};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]+"");
        }
        System.out.println(" ");

        int tersArray[]=new int[arr.length];

        for (int i = 0; i < tersArray.length; i++) {
            tersArray[i]=arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(tersArray));
    }
}
