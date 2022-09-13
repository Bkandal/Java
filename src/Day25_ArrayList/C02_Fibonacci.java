package Day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Fibonacci {
    public static void main(String[] args) {
        // verilen bir sayidan, kücük Fibonacci sayilarini bir list olarak kaydedelim

        int sinir=100;

        List<Integer> fibonacci=new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(1);
        int sayi=0;

        while (sayi<sinir){
            sayi=fibonacci.get(fibonacci.size()-2)+fibonacci.get(fibonacci.size()-1);
            fibonacci.add(sayi);
        }
        System.out.println(fibonacci);
        fibonacci.remove(fibonacci.size()-1);
        System.out.println(fibonacci);
    }
}
