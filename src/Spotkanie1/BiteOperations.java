package Spotkanie1;

public class BiteOperations {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;

        //iloczyn
        System.out.println(String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0'));
        //System.out.println(String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0'));
        System.out.println("--------");

        System.out.println(String.format("%8s",Integer.toBinaryString(~a)).replace(' ', '0'));
        System.out.println();
        System.out.println(String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println(String.format("%8s",Integer.toBinaryString(-(a))).replace(' ', '0'));




    }
}
