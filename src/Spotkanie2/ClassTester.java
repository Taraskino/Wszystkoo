package Spotkanie2;

public class ClassTester {
    int i; // - zmienna ekzemplarza (pole klasy)
    static int j = 2; // - zmienna klasowa (pole statyczne)
    public int change(){
        int k = 7;               //zmienna lokalna
        return i + (k * j);
    }
    public static void main(String[] args) {
        int i = 77;
        ClassTester classTEster = new ClassTester();
        System.out.println("Wyswietlam zmienną ekzemplarza 'i' dla classTester " + classTEster.i);
        System.out.println("Wyswietlam zmienną lokałną 'i' " + i);
        System.out.println("Wyswietlam zmienną klasową (statyczną) 'j' " + j);
    }
}
