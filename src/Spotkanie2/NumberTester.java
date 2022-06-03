package Spotkanie2;

public class NumberTester {
    public static void main(String[] args) {
         byte a = 7;
         short b;
         int c;
         c = a;
         b = (short) c;

         int q = 5;
         double w = 13.5;
         int e = (int)w / q;
        System.out.println(e);

        Float f1 = 12.5f;
        Float f2 = 27.2f;
        System.out.println(Math.min(f1, f2));
    }
}
