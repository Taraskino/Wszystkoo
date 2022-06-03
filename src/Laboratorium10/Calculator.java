package Laboratorium10;

public class Calculator {
    static int sum ( int a, int b){
        return a + b;
    }
    static int sum ( int a, int b, int c){
        return a + b + c;
    }
    static double sum ( double a, double b){
        return a + b;
    }
    static double sum ( double a, double b, double c){
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1.1,1.2));
        System.out.println(sum(1.1,1.2,1.3));

    }
}
