package Day19_WhileLoop_DoWhileLoop;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        for (char i = 'm'; i >'c' ; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        char krk='m';
        while (krk>'c'){
            System.out.print(krk + " ");
            krk--;
        }
        System.out.println(" ");
char harf='m';
        do {
            System.out.print(harf + " ");
            harf--;
        }while (harf>'c');

    }
}
