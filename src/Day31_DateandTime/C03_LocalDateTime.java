package Day31_DateandTime;


import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();

        System.out.println(tarihSaat);//022-09-01T22:16:12.582868
        System.out.println(tarihSaat.toString().startsWith("2022"));//true






    }
}
