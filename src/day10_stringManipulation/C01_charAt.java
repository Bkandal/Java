package day10_stringManipulation;

public class C01_charAt {
    public static void main(String[] args) {

        String str = "Java ogrenmek ne güzel";
        System.out.println(str.charAt(0));

        System.out.println(str.toUpperCase().charAt(7));

        System.out.println(str.charAt(21));

        // System.out.println(str.charAt(22));
        //son harfi bulmak için str nin uzunlupunun 1 eksiğini index olarak gireriz
        //eğer index olarak uzunluğu veya daha büyük bir sayı girersek java exception verir
        // space tuşu(boşluk) bir karakter olduğundan saymamız gerekiyor
        //charAt() metodu kullandığımızda sonuç char olacağı için artık manipilasyon yapamayız
        //Strin metodlarından kullanmamız gereken bir metod varsa
        //charAt() metodundan sonra kullanmalıyız


    }

}
