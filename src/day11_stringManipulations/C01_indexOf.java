package day11_stringManipulations;

public class C01_indexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok güzel";

        System.out.println(str.indexOf('g'));// 6
        System.out.println(str.indexOf("r"));// 7
        System.out.println(str.indexOf("j"));// -1

        System.out.println(str.indexOf("mek"));// 10

        //eger istediğimiz indexten sonrasını kontrol etmek istersek
        // o zman aynı metodu iki para metreli olrak kullana biliriz

        System.out.println(str.indexOf("g",(6+1)));
        // Yazılan indexten itibaren başlar

        // yukarıdaki strda2. ve 3. e nin indexini bulun
        // 3. "e" yi bula bilmemiz için 1. "e" nin indexsini bulmamız gerekir

       int ilke=str.indexOf("e");
       int ikincie=str.indexOf("e",ilke+1);

       //eger 2. e varsa 3. e nin olup olmadığını ,
        //ve varsa indexini yazdıralım

        if(ikincie==-1){
            System.out.println("verilen str'da 2. e yok");
        }else {
            int ucuncue=str.indexOf("e",ikincie+1);
            if (ucuncue==-1){
                System.out.println("verilen str'da 3. e yok");
            }else {
                System.out.println("verilen str'daki 3. e'nin index'i : " + ucuncue);
            }
        }

    }

}
