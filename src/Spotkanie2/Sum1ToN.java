package Spotkanie2;

import java.util.Scanner;

public class Sum1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("n = " + n);

        int number = 1;
        int sum = 1;
        System.out.print("Suma 1");
        while (number < n){
            number++;
            sum += number;
            System.out.print(" + " + number);
        }
        System.out.println(" = " + sum);
    }
}
