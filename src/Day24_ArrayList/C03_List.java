package Day24_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_List {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,3,5};
        int silinecekEleman=3;
        List<Integer> gecici=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=silinecekEleman){
                gecici.add(arr[i]);
            }

        }
        System.out.println("List Olarak : " + gecici);
        int yeniArray[]=new int[gecici.size()];

        for (int i = 0; i < yeniArray.length; i++) {
            yeniArray[i]=gecici.get(i);
        }
        System.out.println("Array Olarak : " + Arrays.toString(yeniArray));
    }
}
