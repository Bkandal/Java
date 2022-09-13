package Day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_List {
    public static void main(String[] args) {
        // verilen bir listede icinde belirli bir harf olan elemanlari
        // silen bir method yaziniz

        List<String> str=new ArrayList<>();
        str.add("Ceyhun");
        str.add("Yildiz");
        str.add("Mustafa");
        str.add("Tugba");
        str.add("Turgat");

        System.out.println(str);

        String silinecekharf="a";

        str=killThemAll(str,silinecekharf);

    }

    private static List<String> killThemAll(List<String> str, String silinecekharf) {
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).contains(silinecekharf)){
                str.remove(i);
                i--;
            }
        }
        System.out.println(str);
        return str;
    }
}
