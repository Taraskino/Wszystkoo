package Spotkanie4.Wyjątki;

import Laboratorium14.Hamster;
import Spotkanie3.NamedPoint;
import jdk.swing.interop.SwingInterOpUtils;

public class ExceptionThrowDemo {
    public static void main(String[] args) {
        ExceptionThrowDemo exceptionThrowDemo = new ExceptionThrowDemo();
        int hours = -3;
        int numberOfSeconds = 0;

        try {
            numberOfSeconds = exceptionThrowDemo.getNumberOfSeconds(hours);
        } catch (IllegalArgumentException e){
            System.out.println("UWAGA!!! Korekta danych wejściowych!");
            numberOfSeconds = exceptionThrowDemo.getNumberOfSeconds(hours * -1);
        }
        System.out.println(numberOfSeconds);
    }
    public int getNumberOfSeconds (int hours){
        if (hours < 0){
            throw  new IllegalArgumentException("Wartość godzin musi być >= 0: " + hours);
        }
        return hours * 60 * 60;
    }
}
