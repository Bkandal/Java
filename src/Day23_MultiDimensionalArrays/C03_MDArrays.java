package Day23_MultiDimensionalArrays;

public class C03_MDArrays {
    public static void main(String[] args) {
        int arr[][]={{1,2},{4,5,6,7}};
        carpimYazdir(arr);
        int carpim=1;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim*=arr[i][j];
            }
        }
        System.out.println(carpim);//1680


    }

    private static void carpimYazdir(int[][] arr) {
        int carpim =1;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim*=arr[i][j];
            }
        }
        System.out.println(carpim);//1680
    }
}
