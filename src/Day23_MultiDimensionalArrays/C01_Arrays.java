package Day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,3,5,8,3,4,9};
        int silinecekEleman=5;
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==silinecekEleman){
                sayac++;
            }
        }
        System.out.println(sayac);
        int yeniArrayUzunluk=arr.length-sayac;

        int yeniArr[]=new int[yeniArrayUzunluk];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=silinecekEleman){
                yeniArr[index]=arr[i];
                index++;
            }

        }
        System.out.println(Arrays.toString(yeniArr));
    }
}
