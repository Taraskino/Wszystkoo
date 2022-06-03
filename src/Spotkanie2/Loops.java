package Spotkanie2;

public class Loops {
    public static void main(String[] args) {
        int x = 0;
       if (x > 0){
           System.out.println(" x większe od 0");
       } else if (x < 0){
           System.out.println(" x mniejsze od 0");
       } else {
           System.out.println("Równe zero");
       }
    char grade = 'D';
    switch (grade){
        case 'A':
            System.out.println("Wspaniake!"); break;
        case 'B':
            System.out.println("Też spoko"); break;
        default:
            System.out.println("Takiej oceny nie ostnieje");break;
    }
    }
}
