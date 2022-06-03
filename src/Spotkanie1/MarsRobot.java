package Spotkanie1;

public class MarsRobot {
    String status;
    int speed;
    float temperature;

    void checkTemperature(){
        if (temperature < -80){
            status = "powrót do domu";
            speed = 5;
        }
    }

    void showAttributes(){
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }


}
