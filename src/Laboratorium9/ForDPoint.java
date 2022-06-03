package Laboratorium9;

import java.awt.*;

public class ForDPoint extends Point {
    int z, t;
    static ForDPoint create(int x, int y, int z, int t){
        ForDPoint forDPoint = new ForDPoint();
        forDPoint.x = x;
        forDPoint.y = y;
        forDPoint.z = z;
        forDPoint.t = t;
        return forDPoint;
    }
      void show(){
          System.out.println("x wynosi: " + this.x);
          System.out.println("y wynosi: " + this.y);
          System.out.println("z wynosi: " + this.z);
          System.out.println("t wynosi: " + this.t);


      }

    public static void main(String[] args) {
        ForDPoint forDPoint =  create(1,2,3,4);
        forDPoint.show();

    }
}
