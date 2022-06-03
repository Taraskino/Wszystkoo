package Spotkanie2;

import java.awt.*;

public class Arrays {
    public static void main(String[] args) {
        Point[] points = {new Point(1, 1), new Point(2, 2), new Point(0, 0)};
        System.out.println(points[0]);
        Point p = new Point(5, 5);
        points[0] = p;
        System.out.println(points[0]);
        points[0].y = 9;
        System.out.println(points[0]);

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };
    }
}
