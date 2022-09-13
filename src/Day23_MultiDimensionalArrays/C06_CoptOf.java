package Day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C06_CoptOf {
    public static void main(String[] args) {
        int arr1[]={3,5,7,10};
        int arr2[]={2,4,6};

        int birlesikArray[]=birlestir(arr1,arr2);
        Arrays.sort(birlesikArray);
        System.out.println(Arrays.toString(birlesikArray));//[3, 5, 7, 10, 2, 4, 6]
    }

    private static int[] birlestir(int[] arr1, int[] arr2) {
        int birlesikArray[]=Arrays.copyOf(arr1,arr1.length+arr2.length);

        for (int i = 0; i < arr1.length; i++) {
            birlesikArray[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            birlesikArray[i+ arr1.length]=arr2[i];
        }
        System.out.println(Arrays.toString(birlesikArray));
        return birlesikArray;
    }
}
