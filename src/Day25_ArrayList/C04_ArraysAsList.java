package Day25_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraysAsList {
    public static void main(String[] args) {
        String arr[]={"A","B","C","D"};
        List<String>arraydenList= Arrays.asList(arr);
        System.out.println(arraydenList);//[A, B, C, D]
        //arraydenList.add("F"); RTE Desteklenmeyen islem

        arr[1]="Z";
        System.out.println("Array''i degistirdikten sonra array : "+ Arrays.toString(arr));//[A, Z, C, D]
        System.out.println("Array''i degistirdikten sonra list : " + arraydenList);

        arraydenList.set(3,"d");
        System.out.println("list'i degistirdikten sonra list : " + arraydenList);
        System.out.println("List'i degistirdikten sonra array : " + arraydenList);





    }
}
