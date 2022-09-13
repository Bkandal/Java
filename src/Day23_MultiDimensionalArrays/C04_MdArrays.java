package Day23_MultiDimensionalArrays;

public class C04_MdArrays {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5},{6}};

        int sonuc=1;

        for (int i = 0; i < arr.length; i++) {
            int sonElementIndex=arr[i].length-1;
            sonuc*=arr[i][sonElementIndex];

        }
        System.out.println(sonuc);//90
    }
}
