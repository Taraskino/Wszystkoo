package Spotkanie4.Wyjątki;

import java.lang.reflect.Array;

public class ExceptionTester {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        try {
            System.out.println("Nasz numer to: " + numbers[3]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Nie ma takiego indeksu: " + e.getMessage());
            }
        catch (Exception e) {
            //zapis do logów
            System.out.println("Coś poszło nie tak...");
        }
        finally {
            System.out.println("Koniec");
        }
    }
}
