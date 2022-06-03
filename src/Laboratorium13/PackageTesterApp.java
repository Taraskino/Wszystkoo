package Laboratorium13;

import Laboratorium13.pl1.PackageTester;

public class PackageTesterApp {
    public static void main(String[] args) {
        Laboratorium13.pl1.PackageTester pt1 = new Laboratorium13.pl1.PackageTester();
        Laboratorium13.pl2.PackageTester pt2 = new Laboratorium13.pl2.PackageTester();
        Laboratorium13.pl3.PackageTester pt3 = new Laboratorium13.pl3.PackageTester();
        pt1.introduce();
        pt2.introduce();
        pt3.introduce();

    }
}
