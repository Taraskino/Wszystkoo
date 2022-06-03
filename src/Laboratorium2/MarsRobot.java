package Laboratorium2;

public class MarsRobot implements Robot{
    String status;
    int speed;
    float temperature;

    @Override
    public void checkStatus() {
        if (status.equals("uchu")){
            speed = 1000000000;
            temperature = 34687;
        }
    }

    public void checkTemperature(){
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
