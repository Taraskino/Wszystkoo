package Spotkanie4.Wyjątki;

public class AgeTester {
    static void checkAge(int age){
        if(age < 18){
            throw new AgeRangeException("Uwaga, osoba niepełnolietnia!");
        }else {
            System.out.println("Dostęp pryznany");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(17);
        } catch (Exception e) {
            System.out.println("Naruszenie zasad! Uwaga, osoba niepełnolietnia!");
        }
    }
}
