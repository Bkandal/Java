package Day29_StaticBlock_PassByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {
    public static void main(String[] args) {

        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");

        listEmanlarDegistir(harfler);
        System.out.println("Main Method'a donunce list : " + harfler);//[D, B, C]

        listDegistir(harfler);
        System.out.println("List'e yeni List atayınca Main Method'a donunce list : " + harfler);//[D, B, C]
    }

    private static void listDegistir(List<String> harfler) {
        harfler=new ArrayList<>();
        System.out.println("List'e yeni deger atayınca : " + harfler);//[]
    }

    private static void listEmanlarDegistir(List<String> harfler) {
        harfler.set(0,"D");
        System.out.println("method'da Degistirdigimiz List : " + harfler);//[D, B, C]

    }
}
