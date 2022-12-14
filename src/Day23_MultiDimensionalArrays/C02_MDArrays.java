package Day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C02_MDArrays {
    public static void main(String[] args) {
        int arr[][] = new int[3][2];
        System.out.println(Arrays.toString(arr));//[[I@19dfb72a, [I@17c68925, [I@7e0ea639]
                                                // Referacelerini Yazdırır
        System.out.println(Arrays.toString(arr[1]));//[0, 0]
        System.out.println(Arrays.deepToString(arr));//[[0, 0], [0, 0], [0, 0]]

    arr[0][1]=5;
    arr[1][0]=2;
    arr[2][1]=3;
        System.out.println(Arrays.deepToString(arr));//[[0, 5], [2, 0], [0, 3]]
        int arr2[][]={{0},{1,2,3},{6,7,8,9}};
        System.out.println(Arrays.deepToString(arr2));//[[0], [1, 2, 3], [6, 7, 8, 9]]
        System.out.println(Arrays.toString(arr2[1]));//[1, 2, 3]
        System.out.println(arr2[2][1]);//7
    }
}
