package day11_stringManipulations;

public class C07_startsWith {
    public static void main(String[] args) {

        String input="Java gun gectikce güzellesiyor";

        System.out.println(input.startsWith("J"));
        System.out.println(input.startsWith(""));
        System.out.println(input.startsWith("gun",5));

    }
}
