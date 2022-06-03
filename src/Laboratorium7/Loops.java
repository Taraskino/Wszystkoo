package Laboratorium7;

public class Loops {
    public static void main(String[] args) {
        int n = 2;
        System.out.println("n = " + n + " matrix");
        System.out.println("_____________");
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print( i + j + "  ");
            }
            System.out.println();
        }
        System.out.println();
        n = 3;
        System.out.println("n = " + n + " matrix");
        System.out.println("_____________");
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print( i + j + "  ");
            }
            System.out.println();
        }
        System.out.println();
        n = 4;
        System.out.println("n = " + n + " matrix");
        System.out.println("_____________");
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print( i + j + "  ");
            }
            System.out.println();
        }
    }
}
