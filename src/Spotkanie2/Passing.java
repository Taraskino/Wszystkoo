package Spotkanie2;

import java.awt.*;

public class Passing {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Przed zmianą 'i' " + i);
        changeIt(12);
        System.out.println("Po zmianie 'i' " + i);

        Point point = new Point(1,1);
        System.out.println("Przed zmianą 'p' " + point);
        changePoint(point);
        System.out.println("Po zmianie 'p' " + point);



    }
    static void changeIt(int i){
        System.out.println("Zmieniam 'i' na " + i);
        i++;
    }
    static void changePoint(Point point){
        System.out.println("Zmieniam point ");
        point.x++;
        point.y++;
    }

}
