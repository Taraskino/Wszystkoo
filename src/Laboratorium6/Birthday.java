package Laboratorium6;

public class Birthday {
    public static void main(String[] args) {
        String birthday = "29/04/2016";
        String date = birthday.substring(0,2);
        String month = birthday.substring(3,5);
        String year = birthday.substring(6,10);
        System.out.println("Data: " + date);
        System.out.println("Miesąc: " + month);
        System.out.println("Rok: " + year);
    }
    
}
