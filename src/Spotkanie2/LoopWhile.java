package Spotkanie2;

public class LoopWhile {
    public static void main(String[] args) {
        boolean cond = true;
        while (cond){
            System.out.println("Działa pętla");
            if ((int)(Math.random() * 49 + 1) == 20){
                cond = false;
            }
        }
    }
}
