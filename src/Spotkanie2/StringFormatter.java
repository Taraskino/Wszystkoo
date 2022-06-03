package Spotkanie2;

public class StringFormatter {
    public static void main(String[] args) {
        int accountBalance = 15_005;
        System.out.println(accountBalance);
        System.out.printf("Saldo: %,d zł ",accountBalance);
    }
}
