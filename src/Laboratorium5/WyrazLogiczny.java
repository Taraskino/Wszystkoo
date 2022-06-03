package Laboratorium5;

import java.util.Scanner;

public class WyrazLogiczny {
    public static void main(String[] args) {
        int ourCount = 35;
        int firstCount = 7;
        int secondCount = 5;
        System.out.println((((ourCount % firstCount) ==0 ) && (ourCount % secondCount)==0) ? "wolno" : "nie wolno");


    }
}
