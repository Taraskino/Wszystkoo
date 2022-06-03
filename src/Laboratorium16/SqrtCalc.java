package Laboratorium16;

import java.util.Scanner;

public class SqrtCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = 0;
        double dSqrt;
        try {
            d = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Błąd, podana wartość nie jest liczbą!");
            System.exit(-1);
        }

        if(d < 0){
            throw new IllegalArgumentException("Podano liczbę ujemną!");
        }
        dSqrt = Math.sqrt(d);
        System.out.println(dSqrt);
    }
}
