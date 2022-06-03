package Laboratorium2;

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
        System.out.println();

        System.out.println("Tworzymy nowyj obiekt o nazwie 'opportunity' ");
        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "ba-ba-ch";
        opportunity.speed = 200;
        opportunity.temperature = 459;
        opportunity.showAttributes();
        System.out.println();
        System.out.println("Zmieniamy status robota opportunity na 'uchu'");
        opportunity.status = "uchu";
        opportunity.checkStatus();
        opportunity.showAttributes();
    }
}
