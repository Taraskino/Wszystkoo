package Spotkanie2;

public class OfWhatClassObject {
    public static void main(String[] args) {
        String str1 = "Alla";
        System.out.println(str1.getClass().getName());

        boolean chek1 = "Texas" instanceof String;
        System.out.println(chek1);

        Object obj = new Object();
        System.out.println(obj instanceof String);
    }
}
