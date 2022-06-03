package Laboratorium5;

public class Inwestycja {
    public static void main(String[] args) {
        int firstCapital = 14_000;
        String carency = " zł ";
        System.out.println("Początkująca wartosć inwestycji to: " + firstCapital + carency );
        firstCapital += (firstCapital * 0.4);
        System.out.println("Wartosć inwestycji po pierwszym roku to: " + firstCapital + carency );
        firstCapital -= 1_200;
        System.out.println("Wartosć inwestycji po drugim roku to: " + firstCapital + carency );
        firstCapital += (firstCapital * 0.12);
        System.out.println("Wartosć inwestycji po trzecim roku to: " + firstCapital + carency );




    }
}
