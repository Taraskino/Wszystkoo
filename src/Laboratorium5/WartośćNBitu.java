package Laboratorium5;

public class WartośćNBitu {
    public static void main(String[] args) {
        int ourCount = 5;
        int bitPosition = 2;
        int mask = 1 << bitPosition;
        System.out.println(String.format("%8s", Integer.toBinaryString(ourCount)).replace(' ', '0'));

    }
}
