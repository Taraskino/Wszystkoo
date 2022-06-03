package Spotkanie2;

public class EqualsTester {
    public static void main(String[] args) {
        String st1, st2;
        st1 = "Ala ma kota.";
        st2  = st1;
        st2 = new String("Ala ma kota.");
        System.out.println("Czy to są te same obiekty? : " + (st1 == st2));
        System.out.println("Czy st1 i st2 mają tą samą zawartość? : " + st1.equals(st2));
    }
}
