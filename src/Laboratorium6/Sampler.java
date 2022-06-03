package Laboratorium6;

public class Sampler {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.depth = 72;
        sample.height = 1000;
        sample.weight = 24;
        System.out.println("Glębokość = " + sample.depth );
        System.out.println("Wysokośc = " + sample.height );
        System.out.println("Szerokość = " + sample.weight );
    }
}
