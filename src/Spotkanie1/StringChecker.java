package Spotkanie1;

import java.util.Locale;

public class StringChecker {
    public static void main(String[] args) {
        String str = "Lannister zawsze splaca swoje długi";
        System.out.println("Tekdst, to: " + str);
        System.out.println("Długość tekstu, to: " + str.length());
        System.out.println("Znak na pozycji 6, to: " + str.charAt(6-1));
        System.out.println("Fragment tekstu 6 - 10, to: " + str.substring(10-1, 16));
        System.out.println("Indeks pierwszej lirety 't', to: " + str.indexOf('t'));
        System.out.println("Indeks początku testu 'długi', to: " + str.indexOf("długi"));
        System.out.println("Tekst, zapisany wielkimi literami, to: " + str.toUpperCase());



    }
}
