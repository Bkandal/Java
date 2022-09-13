package Day29_StaticBlock_PassByValue;

public class C01_StaticBlocks {
    static {
        System.out.println("Static Blok Main Methoddan bile nce calisir");
    }
    public static void main(String[] args) {
        System.out.println("Javada Once Main Method Calisir");

    }
    static {
        System.out.println("Static Blok nereye yazilirsa yazilsin main method'danbile once calisir");

        // Eger birden fazla static blok varsa Java yukaridakini daha önce calistirir
    }
}
