package Spotkanie1;

public class Weather {
    public static void main(String[] args) {
    double fahrenheit = 86;
        System.out.print(fahrenheit + " stopni fahrenheita to ");
        fahrenheit -= 32;
        fahrenheit /= 9;
        fahrenheit *= 5;
        System.out.println(fahrenheit + " stopni celsjusza!");
        System.out.println();

        double celsjusz = 33;
        System.out.print(celsjusz + " stopni celsjusza to ");
        celsjusz *= 9;
        celsjusz /= 5;
        celsjusz += 32;
        System.out.println(celsjusz + " stopni fahrenheita!");


    }
}
