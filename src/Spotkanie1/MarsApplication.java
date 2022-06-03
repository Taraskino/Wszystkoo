package Spotkanie1;

public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttributes();
        System.out.println();
        System.out.println("Zwiększenie prędkośći do 3");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println();
        System.out.println("Zmiana temperatury na -90");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println();
        System.out.println("Sprawdzenie temperatury");
        spirit.checkTemperature();
        spirit.showAttributes();
    }
}
