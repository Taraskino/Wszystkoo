package Spotkanie3;

public class Shop {
    public static void main(String[] args) {
        Product p1 = new Product("Mleko", 3.25);
        Product p2 = new Product("Mleko", 3.25);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
}
